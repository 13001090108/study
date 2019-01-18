package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

//声明一个控制器
/*
当我们再修改后@RequestMapping时，还可以对HomeController做另外一个变更，@RequestMapping的value属性
能够接受一个String类型的数组。到目前为止，我们给他设置的都是一个String类型的"/".但是，我们可以将他映射到对
"/"和"/homepage"的请求与，只需将类级别的@RequestMapping改为如下所示。
 */
@Controller
@RequestMapping({"/" , "/homepage"})
public class HomeController {

  @RequestMapping(method = GET)
  public String home(Model model) {
    model.addAttribute("name" ,"lsc");
    return "home";
  }

}
