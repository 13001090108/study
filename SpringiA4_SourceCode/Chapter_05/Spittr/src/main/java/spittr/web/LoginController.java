package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spitter;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public  String login(Model model) {
        return "login";
    }

    @RequestMapping(method=POST)
    public String processLogin(Spitter spitter) {


        if(1 == 1){
            return "redirect:/spittles" ;
        }
        else {
            return "redirect:/login";
        }
    }
}
