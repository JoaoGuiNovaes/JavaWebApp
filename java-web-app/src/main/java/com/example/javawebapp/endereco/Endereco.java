package com.example.javawebapp.endereco;

public class Endereco {
    private Integer id;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String estado;
    private String cidade;
    private String pontoReferencia;
    private Integer id_usuario;


    public Endereco(Integer id, String cep, String endereco, String numero, String complemento, String bairro,
            String estado, String cidade, String pontoReferencia, Integer id_usuario) {
        this.id = id;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.pontoReferencia = pontoReferencia;
        this.id_usuario = id_usuario;
    }



    public Endereco(Integer id, String cep, String endereco, String numero, String complemento, String bairro,
            String estado, String cidade, String pontoReferencia) {
        this.id = id;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.pontoReferencia = pontoReferencia;
    }



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getPontoReferencia() {
        return pontoReferencia;
    }
    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    

}
