package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {

        model.addAttribute("val", val);


        return "output";
    }

    @PostMapping("/input")
    public String postForm1(@RequestParam("val") String val, Model model) {

        model.addAttribute("val", val);


        return "input";
    }
}