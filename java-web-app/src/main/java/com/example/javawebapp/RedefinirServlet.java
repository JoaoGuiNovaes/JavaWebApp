package com.example.javawebapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 1. criar uma classe em java
// 2. extends HttpServlet
// 3. "roteamento" anotar a classe com @WebServlet definir
// name e value
// 4. sobreescrever os métodos do???  doGet, doPost, doDelete, etc
// e definir o comportamento

@WebServlet(name = "redefinir", value = "/redefinir")
public class RedefinirServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String NovaSenha = req.getParameter("senha");
        String ConfirmarNovaSenha = req.getParameter("confirmarsenha");
       
        // salvar no banco de dados
        // enviar um email para o admin com a mensagem

        System.out.println(NovaSenha);
        System.out.println(ConfirmarNovaSenha);
       
    }

    

}
