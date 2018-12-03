/*
*Esse documento faz parte de uma aplicação desenvolvida na matéria de APSOO-2018/2 na FACOM, 
*disciplina lecionada pelo Profª Edilson Palma
*Seu uso é permitido para fins acadêmicos, todavia mantendo a referência de autoria.
*@author Alexya M. Viana Domingues - Acadêmica de Engenharia de Software
*@author Bruna Luzia A. Rodrigues - Acadêmica de Engenharia de Software
*@author Hanna Karoline T. Palacios - Acadêmica de Engenharia de Software
*@author Gabriel Fernando Texeira - Acadêmica de Engenharia de Software
-->JFRAME TelaVenda que tem como objetivo final implementar a parte visual do sistema
*/
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bruna Luzia A. Rodrigues
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