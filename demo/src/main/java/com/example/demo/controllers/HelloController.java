package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        /*O spring vai renderizar o ficheiro (a "view") que esta em resources/templates/hello.html*/
        return "hello";
    }
}
