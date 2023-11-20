package com.example.javawebapp.endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.javawebapp.db.Conexao;

public class EnderecoDao {
    public static Endereco cadastrarEndereco(String cep, String endereco, String numero, String complemento, String bairro, String estado, String cidade, String pontoReferencia) {
        Endereco endereco2 = null;
        String sql = "INSERT INTO enderecos (cep, endereco, numero, complemento, bairro, estado, cidade, pontoReferencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, cep);
            statement.setString(2, endereco);
            statement.setString(3, numero);
            statement.setString(4, complemento);
            statement.setString(5, bairro);
            statement.setString(6, estado);
            statement.setString(7, cidade);
            statement.setString(8, pontoReferencia);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                endereco2 = new Endereco(rs.getInt(1), cep, endereco, numero, complemento, bairro, estado, cidade, pontoReferencia);
            }

            rs.close();

            return endereco2;  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Endereco buscarPorIdEndereco(Integer id) {
        String sql = "SELECT * FROM enderecos WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return new Endereco(
                    rs.getInt("id"),
                    rs.getString("cep"),
                    rs.getString("endereco"),
                    rs.getString("numero"),
                    rs.getString("complemento"),
                    rs.getString("bairro"),
                    rs.getString("estado"),
                    rs.getString("cidade"),
                    rs.getString("pontoReferencia")
                );
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
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
