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

import codigo.Estoque;
import codigo.ItemDeVenda;
import codigo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruna Luzia A. Rodrigues
 */
public class ItemVendaDAO {
    public void inserirItemVenda (String idProduto,String qtdItem) throws Exception {
        Connection conn = ConexaoBD.abrir();
        try{ 
            String sql = "INSERT INTO Item_Venda (idProduto,idCategoriaProd,(SELECT max(idVenda) from Venda),qtd) VALUES (?,?,?)";
            PreparedStatement stmt = null;
            stmt.setString(1, idProduto);
            stmt.setString(2, qtdItem);
            stmt= conn.prepareStatement(sql);
            ResultSet resultado;
            resultado = stmt.executeQuery(); 
             
            List<ItemDeVenda> lista = new ArrayList<ItemDeVenda>();
            while (resultado.next()) {
                ItemDeVenda item = new ItemDeVenda();
                item.setIdProduto(resultado.getInt("idProduto"));
                item.setIdVenda(resultado.getInt("idVenda"));
            }
            stmt.close();
        } catch (SQLException e){ 
            throw new RuntimeException(e); 
        }
    }
}
