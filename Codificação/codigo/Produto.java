package codigo;

import bd.ConexaoBD;
import bd.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
