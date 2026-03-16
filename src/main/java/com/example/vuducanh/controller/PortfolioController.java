package com.example.vuducanh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Vũ Đức Anh");
        model.addAttribute("title", "Full Stack Developer");
        model.addAttribute("about", "Tôi là một lập trình viên đam mê công nghệ, yêu thích việc xây dựng các ứng dụng web hiện đại và sáng tạo.");
        
        model.addAttribute("skills", new String[]{
            "Java", "Spring Boot", "Thymeleaf", "React", 
            "HTML/CSS", "JavaScript", "MySQL", "Git"
        });
        
        model.addAttribute("projects", new Object[]{
            new Object(){ public String name = "E-Commerce Website"; public String desc = "Website bán hàng với Spring Boot"; public String tech = "Java, Spring, MySQL"; },
            new Object(){ public String name = "Portfolio Website"; public String desc = "Trang portfolio cá nhân"; public String tech = "HTML, CSS, JS"; },
            new Object(){ public String name = "Task Management App"; public String desc = "Ứng dụng quản lý công việc"; public String tech = "React, Node.js"; }
        });
        
        model.addAttribute("contact", new Object(){
            public String email = "vuducanh@example.com";
            public String phone = "+84 123 456 789";
            public String location = "Hà Nội, Việt Nam";
            public String github = "github.com/vuducanh";
            public String linkedin = "linkedin.com/in/vuducanh";
        });
        
        return "portfolio/index";
    }
}