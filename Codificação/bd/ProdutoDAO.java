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
import codigo.Estoque;
import codigo.Produto;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
 import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProdutoDAO {
    private String nomeProduto;
    /**
     *
     * @param prod
     * @return
     * @throws Exception
     */
    public List<Produto> buscarProduto(String nomeProduto) throws Exception {
        Connection conn = ConexaoBD.abrir();
        try{ 
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
        