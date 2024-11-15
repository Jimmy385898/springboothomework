package com.example.usersystem.HtmlController;

import com.example.usersystem.model.User;
import com.example.usersystem.service.IUserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HtmlUserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/userall")
    public String userAll(HttpServletRequest request, Model model){
        return UserList(model);
    }

    @GetMapping("/useradd")
    public String addUserHtml(Model model){
        model.addAttribute("user",new User());
        return "UserAdd";
    }

    @PostMapping("save")
    public String save(@ModelAttribute User user,Model model){
        System.out.println(user);
        int myValue = userService.insertUser(user);


        return UserList(model);
    }

    @GetMapping("del")
    public String Del(int id,Model model){
        System.out.println("id:"+id);
        int myValue = userService.delUser(id);
        return UserList(model);
    }

    public String UserList(Model model){
        List<User> userList=userService.selectAll();
        System.out.println(userList);
        model.addAttribute("userlist",userList);
        return "userall";
    }


}
