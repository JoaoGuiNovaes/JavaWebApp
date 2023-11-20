package com.example.javawebapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import com.example.javawebapp.forms.CadastroLojaForm;
import com.example.javawebapp.loja.LojaDAO;
import com.example.javawebapp.validators.ValidatorUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import jakarta.validation.ConstraintViolation;

@WebServlet(name = "cadastroProdutoServlet", value = "/CadastroProduto")
public class CadastroProdutoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/CadastroProduto.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nomeProduto = req.getParameter("nomeProduto");
        String categoria = req.getParameter("categoria");
        String fichaTecnica = req.getParameter("fichaTecnica");
        String preco = req.getParameter("preco");

                // Obtendo a Part correspondente à imagem
        Part filePart = req.getPart("imagem");

        // Convertendo Part para InputStream
        InputStream inputStream = filePart.getInputStream();



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