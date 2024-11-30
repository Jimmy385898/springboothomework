package com.example.usersystem.HtmlController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankCardHtmlController {


    @RequestMapping("/bankcard")
    public String listBankCard(HttpServletRequest request, Model model) {
        return "BankCard";
    }
}
