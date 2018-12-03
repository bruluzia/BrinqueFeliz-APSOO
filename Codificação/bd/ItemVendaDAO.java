/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import codigo.Estoque;
import codigo.Produto;
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
public class ItemVendaDAO {
    public List<Produto> inserirItemVenda(String nomeProduto) throws Exception {
        Connection conn = ConexaoBD.abrir();

        try{ 
            //String sql = "SELECT Produto.idProduto from Produto where Produto.nomeProduto = ?"; 
            String sql = "SELECT Produto.idProduto, Produto.nomeProduto, Estoque.quantidade FROM Produto JOIN Estoque ON (Estoque.idProduto = Produto.idProduto) WHERE Produto.nomeProduto = ?";
        PreparedStatement stmt = null;
            
            stmt= conn.prepareStatement(sql);
            stmt.setString(1, nomeProduto); 
            System.out.println(stmt);
            ResultSet resultado;
            resultado = stmt.executeQuery(); 
             
            List<Produto> lista = new ArrayList<Produto>();
            List<Estoque> lista2 = new ArrayList<Estoque>();
            System.out.println(resultado);
            while (resultado.next()) {
                /* Cria um objeto para armazenar uma linha da consulta */
                Produto linha = new Produto();
                linha.setIdProduto(resultado.getInt("idProduto"));
                linha.setNomeProduto(resultado.getString("nomeProduto"));
                Estoque linha2 = new Estoque();
                linha2.setQuantidade(resultado.getInt("quantidade"));
                /* Armazena a linha lida em uma lista */
                lista.add(linha);
                lista2.add(linha2);
                System.out.println("IdProduto"+linha.getIdProduto());
                System.out.println("Nome do Produto"+linha.getNomeProduto());
                System.out.println("Quantidade em Estoque"+linha2.getQuantidade());
            }
            stmt.close();
            return lista;
        } catch (SQLException e){ 
            throw new RuntimeException(e); 
        }
    }     
}
