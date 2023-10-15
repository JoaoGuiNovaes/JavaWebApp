package com.example.javawebapp;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.example.javawebapp.validators.EmailValidator;

@WebServlet(name = "Login", value = "/Login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");


        ArrayList<String> erros = new ArrayList<>();

        if (email == null || email.isBlank()){
            erros.add("o email não pode ser vazio");
        }

        if (email != null && !EmailValidator.isValid(email)) {
            erros.add("E-mail inválido");
        }

        if (senha != null && (senha.length() < 8 || senha.length() > 20)) {
            erros.add("Senha deve ter no mínimo 8 e no máximo 20 caracteres");
        }

        if (senha == null || senha.isEmpty()) {
            erros.add("A senha não pode ser vazia");
        }

        if (senha != null) {
            boolean letraMinuscula = false;
            boolean letraMaiuscula = false;
            boolean digito = false;

            for (char c : senha.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    letraMinuscula = true;
                } else if (Character.isUpperCase(c)) {
                    letraMaiuscula = true;
                } else if (Character.isDigit(c)) {
                    digito = true;
                }
            }

            if (!letraMinuscula) {
                erros.add("A Senha deve ter uma letra minúscula");
            }

            if (!letraMaiuscula) {
                erros.add("A Senha deve ter uma letra maiúscula");
            }

            if (!digito) {
                erros.add("A Senha deve ter um número");
            }
        }


        if (erros.isEmpty()) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/Home.jsp");
            dispatcher.forward(req, res);
        } else {
            req.setAttribute("senha", senha);
            req.setAttribute("email", email);
            req.setAttribute("erros", erros);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/Login.jsp");
            dispatcher.forward(req, res);
        }
    }

}
