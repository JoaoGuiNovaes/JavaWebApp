package com.example.javawebapp.forms;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CadastroLojaForm {
    @NotNull
    @NotBlank
    private String nomeFantasia;
    @NotNull
    @NotBlank
    @Email
    private String email;
    @NotNull    
    @NotBlank
    private String razaoSocial;
    @NotBlank
    @NotNull
    @CNPJ
    private String cnpj;
    @NotNull
    @NotBlank
    @Size(min = 4, max = 30)
    private String senha;
    @NotBlank
    @NotNull
    @Size(min = 4, max = 30)
    private String confirmarSenha;

    public CadastroLojaForm(@NotNull @NotBlank String nomeFantasia, @NotNull @NotBlank @Email String email,
            @NotNull @NotBlank String razaoSocial, @NotBlank @NotNull @CNPJ String cnpj,
            @NotNull @NotBlank @Size(min = 4, max = 30) String senha,
            @NotBlank @NotNull @Size(min = 4, max = 30) String confirmarSenha) {
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
    
}