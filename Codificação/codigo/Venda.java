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
*@author Gabriel Teixeira, @author Bruna Luzia
*/

import bd.VendaDAO;
import java.sql.Time;
import java.util.Date;

public class Venda {
    private int idVenda;
    private Date data;
    private Time horario;
    
    //
    public void realizarVenda() throws Exception{
        VendaDAO vendaDAO = new VendaDAO();
        idVenda = vendaDAO.inserirVenda();        
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
	
    
    public void adicionarItem(int item) {}
	
    //getters e setters
    public Date getData() {
    	return data;
    }
    public void setData(Date data) {
	this.data = data;
    }
    public Time getHorario() {
	return horario;
    }
    public void setHorario(Time horario) {
	this.horario = horario;
    }	
}
