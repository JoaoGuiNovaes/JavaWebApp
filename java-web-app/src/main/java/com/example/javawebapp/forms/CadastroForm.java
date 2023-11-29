package com.example.javawebapp.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CadastroForm {
    @NotNull
    @NotBlank
    private String Nome;
    @NotNull
    @NotBlank
    @Email
    private String Email;
    @NotNull
    @NotBlank
    @Size(min = 4, max = 30)
    private String Senha;
    @NotBlank(message = "Insira uma data!")
    @NotNull(message = "Insira uma data!")
    @DataNascimentoValida(message = "Não é possível registrar datas posteriores à data atual, e só maiores de 12 anos podem se cadastrar!")
    private String dataNascimento;
    @NotBlank(message = "Preencha o campo confirmar senha!")
    @NotNull(message = "Preencha o campo confirmar senha!")
    private String confirmarSenha;

    public CadastroForm(@NotNull @NotBlank String nome,
            @NotNull @NotBlank @jakarta.validation.constraints.Email String email,
            @NotNull @NotBlank @Size(min = 4, max = 30) String senha, @NotBlank @NotNull @DataNascimentoValida String dataNascimento,
            @NotBlank @NotNull String confirmarSenha) {
        Nome = nome;
        Email = email;
        Senha = senha;
        this.dataNascimento = dataNascimento;
        this.confirmarSenha = confirmarSenha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
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