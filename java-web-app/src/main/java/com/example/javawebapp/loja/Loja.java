package com.example.javawebapp.loja;

public class Loja {

    private Integer id;
    private String nomeFantasia;
    private String email;
    private String razaoSocial;
    private String cnpj;
    private String senha;

    public Loja(Integer id, String nomeFantasia, String email, String razaoSocial, String cnpj, String senha) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
}
