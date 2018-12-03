/*
*Esse documento faz parte de uma aplicação desenvolvida na matéria de APSOO-2018/2 na FACOM, 
*disciplina lecionada pelo Profª Edilson Palma
*Seu uso é permitido para fins acadêmicos, todavia mantendo a referência de autoria.
*@author Alexya M. Viana Domingues - Acadêmica de Engenharia de Software
*@author Bruna Luzia A. Rodrigues - Acadêmica de Engenharia de Software
*@author Hanna Karoline T. Palacios - Acadêmica de Engenharia de Software
*@author Gabriel Fernando Texeira - Acadêmica de Engenharia de Software
-->Classe ItemDeVenda que tem como objetivo tratar o gerenciamento de dados do item de venda
*/
package codigo;
/*
*@author Bruna Luzia A. Rodrigues
*/
public class ItemDeVenda {
    private int idItemDeVenda;
    private int idProduto;
    private int idVenda;
    private int quantidade;

    public int getIdItemDeVenda() {
        return idItemDeVenda;
    }

    public void setIdItemDeVenda(int idItemDeVenda) {
        this.idItemDeVenda = idItemDeVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
