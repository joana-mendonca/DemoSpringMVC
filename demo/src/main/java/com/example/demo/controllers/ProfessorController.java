package com.example.demo.controllers;

import com.example.demo.models.Professor;
import com.example.demo.models.StatusProfessor;
import com.example.demo.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;
    @GetMapping("/professores")
    public ModelAndView index(){
        List<Professor> professores = this.professorRepository.findAll();

        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professores);

        return mv;
    }

    @GetMapping("/professores/new")
    public ModelAndView newProfessor() {
        ModelAndView mv = new ModelAndView("professores/new");
        mv.addObject("statusProfessor", StatusProfessor.values());

        return mv;
    }

}
