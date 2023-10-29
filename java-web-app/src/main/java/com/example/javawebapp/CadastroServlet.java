package com.example.javawebapp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.*;

import com.example.javawebapp.forms.CadastroForm;
import com.example.javawebapp.validators.DateValidator;
import com.example.javawebapp.validators.EmailValidator;
import com.example.javawebapp.validators.ValidatorUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolation;

@WebServlet(name = "Cadastro", value = "/Cadastro")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.sendRedirect("Cadastro.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        String confirmarSenha = req.getParameter("confirmarsenha");
        String dataNascimento = req.getParameter("datanascimento");

           CadastroForm cadastroForm = new CadastroForm(nome, email, senha, dataNascimento, confirmarSenha);
        
        Set<ConstraintViolation<CadastroForm>> violations = ValidatorUtil.validateObject(cadastroForm);
        
        if (violations.isEmpty()) {
            res.sendRedirect("Home.jsp");
        } else {
            req.setAttribute("cadastroForm", cadastroForm);
            req.setAttribute("violations", violations);
            req.getRequestDispatcher("Cadastro.jsp").forward(req, res);
        }

    }
}
