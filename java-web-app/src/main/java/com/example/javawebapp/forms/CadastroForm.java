package com.example.javawebapp.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CadastroForm {
    @NotNull 
    @NotBlank
    private String nome;
    @NotNull 
    @NotBlank 
    @Email
    private String email;
    @NotNull 
    @NotBlank 
    @Size(min = 4, max = 30)
    private String senha;
    @NotBlank
    @NotNull
    private String dataNascimento;
    @NotBlank
    @NotNull
    @Size(min = 4, max = 30)
    private String confirmarSenha;

  
    public CadastroForm(@NotNull @NotBlank String nome, @NotNull @NotBlank @Email String email,
            @NotNull @NotBlank @Size(min = 4, max = 30) String senha, @NotBlank @NotNull String dataNascimento,
            String confirmarSenha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.confirmarSenha = confirmarSenha;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

}