/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import codigo.Estoque;
import codigo.Produto;
import codigo.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brunn
 */
public class VendaDAO {
    private int codVenda;
    public int inserirVenda () throws Exception {
        Connection conn = ConexaoBD.abrir();
        try{ 
            //String sql = "SELECT Produto.idProduto from Produto where Produto.nomeProduto = ?"; 
            String sql = "INSERT INTO Venda () VALUES ()";
            PreparedStatement stmt = null;
            PreparedStatement stmt2 = null;
            stmt= conn.prepareStatement(sql);
            
            
            String query = "SELECT max(idVenda) from Venda";
            stmt2= conn.prepareStatement(query);
            ResultSet resultado;
            resultado = stmt2.executeQuery(); 
             
            List<Venda> lista = new ArrayList<Venda>();
            while (resultado.next()) {
                /* Cria um objeto para armazenar uma linha da consulta */
                codVenda = resultado.getInt("idVenda");
            }
            stmt.close();
            return codVenda ;

        } catch (SQLException e){ 
            throw new RuntimeException(e); 
        }
    }     
}
