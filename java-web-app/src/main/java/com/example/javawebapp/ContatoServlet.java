package com.example.javawebapp;

import java.io.IOException;
import java.util.ArrayList;

import com.example.javawebapp.validators.EmailValidator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "Contato", value = "/Contato")
public class ContatoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.sendRedirect("Contato.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String mensagem = req.getParameter("mensagem");
      
        ArrayList<String> erros = new ArrayList<>();

        if (nome == null || nome.isBlank()) {
            erros.add("O nome não pode ser vazio");
        }

        if (email == null || email.isBlank()) {
            erros.add("o email não pode ser vazio");
        }

        if (email != null && !EmailValidator.isValid(email)) {
            erros.add("E-mail inválido");
        }

        if (mensagem == null || mensagem.isBlank()) {
            erros.add("A mensagem não pode ser vazio");
        }
    }

    

}
