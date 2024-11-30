package com.example.usersystem.HtmlController;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalismHtmlController {


    @RequestMapping("/journalism")
    public String listJournalism(HttpServletRequest request, Model model) {
        return "Journalism";
    }
}
