package com.example.javawebapp.produto;

public class Produto {
    private Integer id;
    private String nomeProduto;
    private String categoria;
    private String fichaTecnica;
    private String preco;
    private String imagem;
    
    public Produto(Integer id, String nomeProduto, String categoria, String fichaTecnica, String preco, String imagem) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.fichaTecnica = fichaTecnica;
        this.preco = preco;
        this.imagem = imagem;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getFichaTecnica() {
        return fichaTecnica;
    }
    public void setFichaTecnica(String fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
}

