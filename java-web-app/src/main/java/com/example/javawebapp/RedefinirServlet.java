package com.example.javawebapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "Redefinir", value = "/Redefinir")
public class RedefinirServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/Redefinir.jsp").forward(req, res);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String NovaSenha = req.getParameter("senha");
        String ConfirmarNovaSenha = req.getParameter("confirmarsenha");

        System.out.println(NovaSenha);
        System.out.println(ConfirmarNovaSenha);
       
    }

    

}
