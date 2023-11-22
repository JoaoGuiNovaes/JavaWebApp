package com.example.javawebapp;

import java.io.IOException;
import java.util.Set;

import com.example.javawebapp.endereco.Endereco;
import com.example.javawebapp.endereco.EnderecoDao;
import com.example.javawebapp.forms.ProfileForm;
import com.example.javawebapp.usuario.Usuario;
import com.example.javawebapp.usuario.UsuarioDao;
import com.example.javawebapp.validators.ValidatorUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.ConstraintViolation;


@WebServlet(name = "profileServlet", value = "/Profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession();
      
    
        String emailUsuario = (String) session.getAttribute("emailUsuario");
        System.out.println("AQUIIIIIIIIIIII emailUsuario: "+ emailUsuario);
        Integer idUsuarioLogado = UsuarioDao.buscarPorEmail(emailUsuario).getId();
        System.out.println("AQUIIIIIIIIIIII idUsuarioLogado: "+ idUsuarioLogado);
        Usuario usuario = UsuarioDao.buscarPorEmail(emailUsuario);
        Endereco endereco = EnderecoDao.buscarPorIdUsuarioEndereco(idUsuarioLogado);
        System.out.println("AQUIIIIIIIIIIII EnderecoDao.buscarPorIdUsuarioEndereco(idUsuarioLogado): "+ EnderecoDao.buscarPorIdUsuarioEndereco(idUsuarioLogado));
        req.setAttribute("usuario", usuario);
        req.setAttribute("endereco", endereco);
        req.getRequestDispatcher("WEB-INF/Profile.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String cep = req.getParameter("cep");
        String endereco = req.getParameter("endereco");
        String numero = req.getParameter("numero");
        String complemento = req.getParameter("complemento");
        String bairro = req.getParameter("bairro");
        String estado = req.getParameter("estado");
        String cidade = req.getParameter("cidade");
        String pontoReferencia = req.getParameter("pontoReferencia");
        String dataNascimento = req.getParameter("datanascimento");

           ProfileForm profileForm = new ProfileForm(nome, email, cep, endereco, numero, complemento, bairro, estado, cidade, pontoReferencia, dataNascimento);
        
        Set<ConstraintViolation<ProfileForm>> violations = ValidatorUtil.validateObject(profileForm);
        
    //     if (violations.isEmpty()) {
    //         if (UsuarioDao.existeComEmail(email)) {
    //             // mandar erro na tela
    //             req.setAttribute("existeErro", "Já existe um usuário com esse e-mail");
    //             req.getRequestDispatcher("WEB-INF/Profile.jsp").forward(req, res);
    //         } else {
    //             UsuarioDao.atualizarUsuario(null, nome, email, dataNascimento);
    //             UsuarioDao.atualizarEndereco(null, cep, endereco, numero, complemento, bairro, estado, cidade, pontoReferencia);
    //             res.sendRedirect("Profile");
    //         }
    //     } else {
    //         req.setAttribute("cadastroForm", profileForm);
    //         req.setAttribute("violations", violations);
    //         req.getRequestDispatcher("WEB-INF/Profile.jsp").forward(req, res);
    //     }

    // }
}}
