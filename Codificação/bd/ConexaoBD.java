/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 import java.sql.PreparedStatement;

/**
 *
 * @author brunn
 */
public class ConexaoBD{

    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/brinquefeliz";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public static Connection abrir() throws Exception {
        Connection conn = null;
        try{
            // Registrar o driver
            Class.forName(DRIVER);
            // Capturar a conexão
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            // Retorna a conexao aberta
            System.out.println("Conexão efetuada com sucesso");
        }catch(SQLException e){
            System.out.println("Erro ao conectar");
        }
        return conn;   
    }

}