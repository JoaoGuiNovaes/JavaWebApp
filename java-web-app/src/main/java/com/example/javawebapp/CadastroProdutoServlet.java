package com.example.javawebapp;

import java.io.IOException;
import java.util.Set;
import com.example.javawebapp.forms.CadastroProdutoForm;
import com.example.javawebapp.loja.Loja;
import com.example.javawebapp.loja.LojaDAO;
import com.example.javawebapp.produto.ProdutoDAO;
import com.example.javawebapp.validators.ValidatorUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
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
        String imagem = req.getParameter("imagem");

           CadastroProdutoForm cadastroProdutoForm = new CadastroProdutoForm(nomeProduto, categoria, fichaTecnica, preco);
        
        Set<ConstraintViolation<CadastroProdutoForm>> violations = ValidatorUtil.validateObject(cadastroProdutoForm);
        
        if (violations.isEmpty()) {
          
                ProdutoDAO.cadastrar(nomeProduto, categoria, fichaTecnica, preco, imagem);
                res.sendRedirect("CadastroProduto");
            
        } else {
            req.setAttribute("cadastroProdutoForm", cadastroProdutoForm);
            req.setAttribute("violations", violations);
            req.getRequestDispatcher("WEB-INF/CadastroProduto.jsp").forward(req, res);
        }

    }
}