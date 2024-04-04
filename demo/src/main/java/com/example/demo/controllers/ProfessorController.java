package com.example.demo.controllers;

import com.example.demo.dto.RequisicaoNovoProfessor;
import com.example.demo.models.Professor;
import com.example.demo.models.StatusProfessor;
import com.example.demo.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    /**
     * This method creates an object of type Professor
     * that is the result of the submitted form
     * that the user sent in the new.html view file
     *
     * @param novoProfessor the DTO of Professor
     * @return              the Professors' list page view
     */
    @PostMapping("/professores")
    public String create(RequisicaoNovoProfessor novoProfessor) {
        Professor professor = novoProfessor.toProfessor();
        System.out.println(professor);
        /*Inserts values in the database*/
        this.professorRepository.save(professor);

        return "redirect:/professores";
    }
}
