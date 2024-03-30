package com.example.demo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        /*O spring vai renderizar o ficheiro (a "view") que esta em resources/templates/hello.html*/
        return "hello";
    }
    @GetMapping("/hello-servlet")
    public String helloServlet(HttpServletRequest request) {
        request.setAttribute("nome", "HttpServletRequest");
        /*O spring vai renderizar o ficheiro (a "view") que esta em resources/templates/hello.html*/
        return "hello";
    }
    @GetMapping("/hello-model")
    public String helloModel(Model model) {
        model.addAttribute("nome", "Model");
        /*O spring vai renderizar o ficheiro (a "view") que esta em resources/templates/hello.html*/
        return "hello";
    }
    @GetMapping("/hello-model-and-view")
    public ModelAndView helloModelAndView() {
        ModelAndView mv = new ModelAndView("hello"); //nome do ficheiro html a ser renderizado
        mv.addObject("nome", "Model And View");
        return mv;
    }
}
