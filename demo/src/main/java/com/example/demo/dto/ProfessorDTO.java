package com.example.demo.dto;

import com.example.demo.models.Professor;
import com.example.demo.models.StatusProfessor;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

/**
 * Data transfer object (DTO) is an object that carries data between processes.
 * We can use this technique to facilitate communication between two systems
 * (like an API and a server) without potentially exposing sensitive information.
 */
public class ProfessorDTO {
    @NotBlank
    @NotNull
    private String nome;
    @DecimalMin(value = "0.0", inclusive = true)
    @NotNull
    private BigDecimal salario;
    private StatusProfessor statusProfessor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public StatusProfessor getStatusProfessor() {
        return statusProfessor;
    }

    public void setStatusProfessor(StatusProfessor statusProfessor) {
        this.statusProfessor = statusProfessor;
    }

    public Professor toProfessor() {
        Professor professor = new Professor();

        professor.setNome(this.nome);
        professor.setSalario(this.salario);
        professor.setStatusProfessor(this.statusProfessor);

        return professor;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", statusProfessor=" + statusProfessor +
                '}';
    }
}
