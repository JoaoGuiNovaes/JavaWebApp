package com.example.javawebapp.produto;

public class Produto {
    private Integer lojaId;
    private String nomeProduto;
    private double preco;
    private String categoria;
    private String descricao;
    private String imagem;

    public Produto(Integer lojaId, String nomeProduto, double preco, String categoria, String descricao,
            String imagem) {
        this.lojaId = lojaId;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
        this.imagem = imagem;
    }
    
    public Integer getLojaId() {
        return lojaId;
    }
    public void setLojaId(Integer lojaId) {
        this.lojaId = lojaId;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    } 
}


