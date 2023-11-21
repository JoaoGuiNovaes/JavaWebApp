package com.example.javawebapp.forms;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CadastroProdutoForm {
    @NotNull
    @NotBlank
    private String nomeProduto;
    @NotNull
    @NotBlank
    private String categoria;
    @NotNull    
    @NotBlank
    private String fichaTecnica;
    @NotBlank
    @NotNull
    private String preco;

    public CadastroProdutoForm(@NotNull @NotBlank String nomeProduto, @NotNull @NotBlank String categoria,
            @NotNull @NotBlank String fichaTecnica, @NotBlank @NotNull String preco) {
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.fichaTecnica = fichaTecnica;
        this.preco = preco;
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
 
    

}