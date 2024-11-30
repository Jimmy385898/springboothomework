package com.example.demo.HtmlController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/404")
    public String noFoundPage(){
        return "404";
    }

    @GetMapping("/index")
    public String main(Model model) {
        model.addAttribute("msg", "Spring 安全管理");
        return "index";
    }

    @GetMapping("/Java/1")
    public String java(){
        return "/Java/1";
    }

    @GetMapping("/SpringBoot/1")
    public String sp(){
        return "/SpringBoot/1";
    }

    @GetMapping("/userLogin")
    public String userLogin(){
        return "userLogin";
    }

}
