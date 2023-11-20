package com.example.javawebapp.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.example.javawebapp.db.Conexao;
import com.example.javawebapp.endereco.Endereco;

import at.favre.lib.crypto.bcrypt.BCrypt;

// DAO = Data Access Object
public class UsuarioDao {
    public static Usuario cadastrar(String nome, String email, String senha, String dataNascimento) {
        Usuario usuario = null;
        String hashSenha = BCrypt.withDefaults().hashToString(12, senha.toCharArray());
        String sql = "INSERT INTO usuarios (nome, email, senha, dataNascimento) VALUES (?, ?, ?, ?);";
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, hashSenha);
            statement.setString(4, dataNascimento);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                usuario = new Usuario(rs.getInt(1), nome, email, hashSenha, dataNascimento);
            }

            rs.close();

            return usuario;  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Usuario> listarTodos() {
        String sql = "SELECT * FROM usuarios;";
        List<Usuario> alunos = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                alunos.add(
                    new Usuario(
                        rs.getInt("id"), 
                        rs.getString("nome"), 
                        rs.getString("email"), 
                        rs.getString("senha"),
                        rs.getString("dataNascimento")
                    )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
            return alunos;
        } 

        return alunos;
        
    }

    public static Usuario buscarPorId(Integer id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("dataNascimento")
                );
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    public static Usuario buscarPorEmail(String email) {
        String sql = "SELECT * FROM usuarios WHERE email = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, email);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("dataNascimento")
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
        Usuario usuario = buscarPorEmail(email);
        if (usuario != null) {
            BCrypt.Result result = BCrypt.verifyer().verify(senha.toCharArray(), usuario.getSenha());
            return result.verified;
        }
        return false;
    }

    public static Boolean existeComEmail(String email) {
        return buscarPorEmail(email) != null;
    }



    public static Usuario atualizarUsuario(Integer id, String nome, String email, String dataNascimento) {
        Usuario usuario = null;
        String sql = "UPDATE usuarios SET nome = ?, email = ?, dataNascimento = ? WHERE id = ?;";
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, dataNascimento);
            statement.setInt(4, id);
            int linhasAfetadas = statement.executeUpdate();
    
            if (linhasAfetadas > 0) {
                usuario = new Usuario(id, nome, email, dataNascimento);
            }
    
            return usuario;  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    

    public static Endereco atualizarEndereco(Integer id, String cep, String endereco, String numero, String complemento, String bairro, String estado, String cidade, String pontoReferencia) {
        Endereco endereco2 = null;
        String sql = "UPDATE enderecos SET cep = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, estado = ?, cidade = ?, pontoReferencia = ?  WHERE id = ?;";
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, cep);
            statement.setString(2, endereco);
            statement.setString(3, numero);
            statement.setString(4, complemento);
            statement.setString(5, bairro);
            statement.setString(6, estado);
            statement.setString(7, cidade);
            statement.setString(8, pontoReferencia);
            statement.setInt(9, id);
            int linhasAfetadas = statement.executeUpdate();
    
            if (linhasAfetadas > 0) {
                endereco2 = new Endereco(id, cep, endereco, numero, complemento, bairro, estado, cidade, pontoReferencia);
            }
    
            return endereco2;  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}

