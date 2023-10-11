package com.example.javawebapp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.example.javawebapp.validators.DateValidator;
import com.example.javawebapp.validators.EmailValidator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "cadastro", value = "/cadastro")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String confirmarSenha = req.getParameter("confirmarsenha");
        String dataNascimento = req.getParameter("datanascimento");

        ArrayList<String> erros = new ArrayList<>();

        if (nome == null || nome.isBlank()) {
            erros.add("O nome não pode ser vazio");
        }

        if (email == null || email.isBlank()) {
            erros.add("O email não pode ser vazio");
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

        if (confirmarSenha != senha) {
            erros.add("As senhas devem ser iguais");
        }

        if (!DateValidator.isDateValid(dataNascimento)) {
            erros.add("Data inválida");
        } else {
            LocalDate date = LocalDate.parse(dataNascimento, DateValidator.dateTimeFormatter);
            if (DateValidator.isAfter(date)) {
                erros.add("Insira uma data after");
            }
        }

        if (erros.isEmpty()) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/Home.jsp");
            dispatcher.forward(req, res);
        } else {
            req.setAttribute("senha", senha);
            req.setAttribute("confirmarSenha", confirmarSenha);
            req.setAttribute("email", email);
            req.setAttribute("nome", nome);
            req.setAttribute("dataNascimento", dataNascimento);
            req.setAttribute("erros", erros);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/cadastro.jsp");
            dispatcher.forward(req, res);
        }

    }
}
