package com.example.usersystem.HtmlController;

import com.example.usersystem.model.User;
import com.example.usersystem.service.IUserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HtmlUserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/userall")
    public String userAll(HttpServletRequest request, Model model){
        List<User> userList=userService.selectAll();
        System.out.println(userList);
        model.addAttribute("userlist",userList);

        return "userall";
    }

}
