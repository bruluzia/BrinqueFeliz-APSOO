/*
*Esse documento faz parte de uma aplicação desenvolvida na matéria de APSOO-2018/2 na FACOM, 
*disciplina lecionada pelo Profª Edilson Palma
*Seu uso é permitido para fins acadêmicos, todavia mantendo a referência de autoria.
*@author Alexya M. Viana Domingues - Acadêmica de Engenharia de Software
*@author Bruna Luzia A. Rodrigues - Acadêmica de Engenharia de Software
*@author Hanna Karoline T. Palacios - Acadêmica de Engenharia de Software
*@author Gabriel Fernando Texeira - Acadêmica de Engenharia de Software
-->Classe ProdutoDAO que tem como objetivo tratar as buscas, inserções e atualizações
    no banco de dados
*/
package bd;
/*
*@author Bruna Luzia A. Rodrigue
*/
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
    /*Método para inserir nova venda */
    public void inserirVenda () throws Exception {
        Connection conn = ConexaoBD.abrir();
        try{ 
            String sql = "INSERT INTO Venda () VALUES ()";
            PreparedStatement stmt = null;
            stmt= conn.prepareStatement(sql);
        } catch (SQLException e){ 
            throw new RuntimeException(e); 
        }
    }     
}
