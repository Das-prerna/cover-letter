package com.visualcoverletter.visual_cover_letter.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello! Visual Cover Letter API is working.";
    }

}
