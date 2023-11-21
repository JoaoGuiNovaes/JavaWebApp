package com.example.javawebapp.produto;

public class Produto {
<<<<<<< Updated upstream
    private Integer id;
=======
    private Integer produtoId;
>>>>>>> Stashed changes
    private String nomeProduto;
    private String preco;
    private String categoria;
    private String descricao;
    private String imagem;

<<<<<<< Updated upstream
    public Produto(Integer id, String nomeProduto, double preco, String categoria, String descricao,
            String imagem) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
        this.imagem = imagem;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
=======
    public Integer getProdutoId() {
        return produtoId;
    }
    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
>>>>>>> Stashed changes
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
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
    
    public Produto(Integer produtoId, String nomeProduto, String preco, String categoria, String descricao,
            String imagem) {
        this.produtoId = produtoId;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    
}


