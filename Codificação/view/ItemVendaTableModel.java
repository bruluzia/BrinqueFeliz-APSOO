/*
*Esse documento faz parte de uma aplicação desenvolvida na matéria de APSOO-2018/2 na FACOM, 
*disciplina lecionada pelo Profª Edilson Palma
*Seu uso é permitido para fins acadêmicos, todavia mantendo a referência de autoria.
*@author Alexya M. Viana Domingues - Acadêmica de Engenharia de Software
*@author Bruna Luzia A. Rodrigues - Acadêmica de Engenharia de Software
*@author Hanna Karoline T. Palacios - Acadêmica de Engenharia de Software
*@author Gabriel Fernando Texeira - Acadêmica de Engenharia de Software
-->Classe utilizada para gerar os dados da tabela de itens
*/package view;
/*
*@author Alexya M. Viana Domingues
*/

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

}