package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InputController {

    private Object previous;

    @GetMapping("/input")
    public String getInput(Model model) {
        model.addAttribute("val", previous);
        return "input";
    }

}
