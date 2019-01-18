package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lsc on 2019/1/5.
 */

/*
类上的注解@RequestMapping("/hi")指定url路径前面一部分
方法上的注解@RequestMaping("/say")指定url路径最后一部分
也可以只把注解写在方法上，比如@RequestMapping("/hi/say")
 */

@Controller
@RequestMapping("/poetry")
public class HiController {
    @RequestMapping(method =RequestMethod.GET)
    public String poetry(Model model) { //参数中传入Model
        model.addAttribute("name" ,"你好啊，娇娇美女"); //指定Model的值
        model.addAttribute("word" ,"IDEA 搭建SpringMVC helloworld详细网址(写的非常好的一篇博客)");
        model.addAttribute("url","https://www.cnblogs.com/wormday/p/8435617.html");
        model.addAttribute("poetry","<<卧槽>><br>看着风景美如画,本想吟诗赠天下" +
                "<br>奈何自己没文化，只能卧槽浪好大" +
                "<br>" +
                "<br>江山美景美如画，姑娘却说没文化" +
                "<br>如果姑娘没文化，何来卧槽留佳话" +
                "<br>" +
                "<br>一句卧槽是绝句，通俗易懂又霸气" +
                "<br>我虽肚里有文化，一句卧槽敬阁下" +
                "<br>" +
                "<br>谁言姑娘没文化，海阔天空美如画" +
                "<br>那句卧槽声响大，小弟听了都害怕" +
                "<br>" +
                "<br>纵使风景美如画，姑娘却似画中花" +
                "<br>卧槽一句如天籁，惊掉在下一下巴" +
                "<br>");
        return "poetry";
    }
}


