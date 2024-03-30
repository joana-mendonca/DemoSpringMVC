package com.example.demo.controllers;

import com.example.demo.models.Professor;
import com.example.demo.models.StatusProfessor;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {
    @GetMapping("/professores")
    public ModelAndView index(){
        Professor professor_1 = new Professor("Severus Snape", new BigDecimal(15000), StatusProfessor.INATIVO);
        professor_1.setId(1L);
        Professor professor_2 = new Professor("Albus Dumbledore", new BigDecimal(20000), StatusProfessor.REFORMADO);
        professor_2.setId(2L);
        Professor professor_3 = new Professor("Minerva McGonagall", new BigDecimal(10000), StatusProfessor.ATIVO);
        professor_3.setId(3L);

        List<Professor> professores = Arrays.asList(professor_1, professor_2, professor_3);

        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professores);

        return mv;
    }
}
