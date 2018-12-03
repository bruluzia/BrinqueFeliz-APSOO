/*
*Esse documento faz parte de uma aplicação desenvolvida na matéria de APSOO-2018/2 na FACOM, 
*disciplina lecionada pelo Profª Edilson Palma
*Seu uso é permitido para fins acadêmicos, todavia mantendo a referência de autoria.
*@author Alexya M. Viana Domingues - Acadêmica de Engenharia de Software
*@author Bruna Luzia A. Rodrigues - Acadêmica de Engenharia de Software
*@author Hanna Karoline T. Palacios - Acadêmica de Engenharia de Software
*@author Gabriel Fernando Texeira - Acadêmica de Engenharia de Software
-->Classe Venda que tem como objetivo tratar o gerenciamento de dados da venda
*/
package codigo;
/*
*@author Hanna Karoline T. Palacios
*/
import bd.ProdutoDAO;
import java.util.List;

public class Produto {
    private int idProduto;
    private int codigoBarras;
    private String nomeProduto;
    private String fabricante;
    private float precoUnit;
    

    public void buscarProduto(String nomeProduto) throws Exception {
        ProdutoDAO prodDAO = new ProdutoDAO();
        List<Produto> produtos = prodDAO.buscarProduto(nomeProduto);
    }
    public void excluirProduto(int codigoBarras) {

    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }
}
