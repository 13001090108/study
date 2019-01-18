package com.uzipi.controller;

import com.uzipi.entity.User;
import com.uzipi.service.UserService;
import com.uzipi.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService; // Spring 注入 UserService

    /**
     * 跳转到注册页面
     * @param model
     * @return
     */
    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String register(Model model){
        /*
         为什么这里要 new 一个 User 对象？
         因为我们在 JSP 页面中使用了 spring form 标签
         spring form 标签的 modelAttribute 默认需要一个对象用于接收数据
         这里我们是新增，所以用无参构造创建一个空对象（不是null）
          */
        User user = new User();
        model.addAttribute("user", user); // user 加入到 request 域
        return "user/register"; // 跳转到 user/register.jsp 页面
    }

    /**
     * 处理用户注册的表单请求
     * @param user
     * @param file
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(User user,
                             @RequestParam("imgFile") MultipartFile file,
                             Model model){
        if (userService.saveRegister(user, file)){
            model.addAttribute("user", user);
            return "user/show"; // 注册成功，跳转到显示页面
        }
        return "redirect:/user/register"; // 注册失败，重定向到注册页面
    }

    /**
     * 处理图片显示请求
     * @param fileName
     */
    @RequestMapping("/showPic/{fileName}.{suffix}")
    public void showPicture(@PathVariable("fileName") String fileName,
                            @PathVariable("suffix") String suffix,
                            HttpServletResponse response){
        File imgFile = new File(Constants.IMG_PATH + fileName + "." + suffix);
        responseFile(response, imgFile);
    }

    /**
     * 处理图片下载请求
     * @param fileName
     * @param response
     */
    @RequestMapping("/downloadPic/{fileName}.{suffix}")
    public void downloadPicture(@PathVariable("fileName") String fileName,
                                @PathVariable("suffix") String suffix,
                                HttpServletResponse response){
        // 设置下载的响应头信息
		response.setHeader("Content-Disposition",
                "attachment;fileName=" + "headPic.jpg");
        File imgFile = new File(Constants.IMG_PATH + fileName + "." + suffix);
        responseFile(response, imgFile);
    }

    /**
     * 响应输出图片文件
     * @param response
     * @param imgFile
     */
    private void responseFile(HttpServletResponse response, File imgFile) {
        try(InputStream is = new FileInputStream(imgFile);
            OutputStream os = response.getOutputStream();){
            byte [] buffer = new byte[1024]; // 图片文件流缓存池
            while(is.read(buffer) != -1){
                os.write(buffer);
            }
            os.flush();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }


}
