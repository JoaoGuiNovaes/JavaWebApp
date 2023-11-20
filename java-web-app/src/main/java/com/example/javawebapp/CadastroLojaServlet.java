package com.example.javawebapp;

import java.io.IOException;
import java.util.Set;

import com.example.javawebapp.forms.CadastroLojaForm;
import com.example.javawebapp.loja.LojaDAO;
import com.example.javawebapp.validators.ValidatorUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolation;

@WebServlet(name = "cadastroLojaServlet", value = "/CadastroLoja")
public class CadastroLojaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/CadastroLoja.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nomeFantasia = req.getParameter("nomeFantasia");
        String email = req.getParameter("email");
        String razaoSocial = req.getParameter("razaoSocial");
        String cnpj = req.getParameter("cnpj");
        String senha = req.getParameter("senha");
        String confirmarSenha = req.getParameter("confirmarSenha");
       

           CadastroLojaForm cadastroLojaForm = new CadastroLojaForm(nomeFantasia, email, razaoSocial, cnpj, senha, confirmarSenha);
        
        Set<ConstraintViolation<CadastroLojaForm>> violations = ValidatorUtil.validateObject(cadastroLojaForm);
        
        if (violations.isEmpty()) {
            if (LojaDAO.existeComEmail(email)) {
                // mandar erro na tela
                req.setAttribute("existeErro", "Já existe uma loja com esse e-mail");
                req.getRequestDispatcher("WEB-INF/CadastroLoja.jsp").forward(req, res);
            } else {
                LojaDAO.cadastrar(nomeFantasia, email, razaoSocial, cnpj, senha);
                res.sendRedirect("LoginLoja");
            }
        } else {
            req.setAttribute("cadastroLojaForm", cadastroLojaForm);
            req.setAttribute("violations", violations);
            req.getRequestDispatcher("WEB-INF/CadastroLoja.jsp").forward(req, res);
        }

    }
}