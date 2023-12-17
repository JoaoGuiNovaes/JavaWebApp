package com.example.javawebapp.loja;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.example.javawebapp.db.Conexao;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class LojaDAO {
    public static Loja cadastrar(String nomeFantasia, String email, String razaoSocial, String cnpj, String senha) {
        Loja loja = null;
        String hashSenha = BCrypt.withDefaults().hashToString(12, senha.toCharArray());
        String sql = "INSERT INTO Lojas (nomeFantasia, email, razaoSocial, cnpj, senha) VALUES (?, ?, ?, ?, ?);";
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, nomeFantasia);
            statement.setString(2, email);
            statement.setString(3, razaoSocial);
            statement.setString(4, cnpj);
            statement.setString(5, hashSenha);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                loja = new Loja(rs.getInt(1), nomeFantasia, email, razaoSocial, cnpj, hashSenha);
            }

            rs.close();

            return loja;  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Loja> listarTodos() {
        String sql = "SELECT * FROM lojas;";
        List<Loja> alunos = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                alunos.add(
                    new Loja(
                        rs.getInt("id"), 
                        rs.getString("nomeFantasia"), 
                        rs.getString("email"), 
                        rs.getString("razaoSocial"), 
                        rs.getString("cnpj"),
                        rs.getString("senha")
                    )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
            return alunos;
        } 

        return alunos;
        
    }

    public static Loja buscarPorId(Integer id) {
        String sql = "SELECT * FROM lojas WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return new Loja(
                    rs.getInt("id"), 
                    rs.getString("nomeFantasia"), 
                    rs.getString("email"), 
                    rs.getString("razaoSocial"), 
                    rs.getString("cnpj"),
                    rs.getString("senha")
                );
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public static Loja buscarPorEmail(String email) {
        String sql = "SELECT * FROM lojas WHERE email = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, email);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return new Loja(
                    rs.getInt("id"), 
                    rs.getString("nomeFantasia"), 
                    rs.getString("email"), 
                    rs.getString("razaoSocial"), 
                    rs.getString("cnpj"),
                    rs.getString("senha")
                );
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public static Boolean login(String email, String senha) {
        Loja loja = buscarPorEmail(email);
        if (loja != null) {
            BCrypt.Result result = BCrypt.verifyer().verify(senha.toCharArray(), loja.getSenha());
            return result.verified;
        }
        return false;
    }

    public static Boolean existeComEmail(String email) {
        return buscarPorEmail(email) != null;
    }
}
