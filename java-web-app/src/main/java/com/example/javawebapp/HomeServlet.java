package com.example.javawebapp;

import java.io.IOException;
import java.util.List;

import com.example.javawebapp.produto.Produto;
import com.example.javawebapp.produto.ProdutoDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "homeServlet", value = "/Home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

 List<Produto> produtos = ProdutoDAO.listarTodos();

        req.setAttribute("produtos", produtos);

        req.getRequestDispatcher("WEB-INF/Home.jsp").forward(req, res);
    }

}