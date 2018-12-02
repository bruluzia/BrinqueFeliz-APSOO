package codigo;

import java.sql.Time;
import java.util.Date;

public class Venda {
	
    private Date data;
    private Time horario;
	
    public void realizarVenda(int idProduto, int qtd) {}
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
