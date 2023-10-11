package com.example.javawebapp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        req.setAttribute("senha", senha);
       req.setAttribute("email", email);

        
        System.out.println(email);
        System.out.println(senha);

        if (email.equals("a@email.com")) {

    System.out.println("aaaaaaaaaaaaa");

        }
        else{
System.out.println("bbbbbbbbbb");
        }
    }

    
    

}
