package ru.raticate.FirstWebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/")
    String helloPageShow() {
        return "index";
    }

}
