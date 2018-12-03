/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import codigo.Estoque;
import codigo.ItemDeVenda;
import codigo.Produto;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author brunn
 */
public class ItemVendaTableModel extends AbstractTableModel {
    /* Lista para armazenar os cabeçalhos da tabela */

    private Vector colunas;

    /* Lista para armazenar os dados da tabela */
    private Vector linhas;

    public ItemVendaTableModel() {
        /* Definição das colunas da tabela */
        colunas = new Vector();
        colunas.add("Código Produto");
        colunas.add("Nome do Produto");
        colunas.add("Quantidade");

        /* Definição dos dados da tabela */
        linhas = new Vector();
    }

    public int getRowCount() {
        /* Captura o total de linhas da tabela */
        int totalLinhas = linhas.size();

        /* Retorna o total de linhas */
        return totalLinhas;
    }

    public int getColumnCount() {
        /* Captura o total de colunas da tabela */
        int totalColunas = colunas.size();

        /* Retorna o total de colunas */
        return totalColunas;
    }

    public String getColumnName(int coluna) {
        /* Captura o nome da coluna */
        String nomeColuna = (String) colunas.get(coluna);

        /* Retorna o nome da coluna */
        return nomeColuna;
    }

    public Object getValueAt(int linha, int coluna) {
        /* Captura o registro informado */
        Vector registro = (Vector) linhas.get(linha);

        /* Dentro do registro captura a coluna selecionada */
        Object dado = registro.get(coluna);

        /* Retorna o valor capturado */
        return dado;
    }

    public void adicionar(List<Produto> lista, List<Estoque> lista2) {
        /* Reinicializa os dados da tabela */
        linhas = new Vector();

        /* Percorre a lista copiando os dados para a tabela */
        for (Produto d : lista) {
            Produto prod  = new Produto();
            ItemDeVenda item = new ItemDeVenda();
            /* Cria uma linha da tabela */
            Vector<Object> linha = new Vector();
            linha.add(prod.getIdProduto());
            linha.add(prod.getNomeProduto());
            //linha.add(item .getQuantidade());
            /* Adiciona a linha a tabela */
            linhas.add(linha);
        }
        /* Atualiza a tabela */
        fireTableDataChanged();
    }

    void adicionar(List<Produto> lista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}