/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import bd.ConexaoBD;
import codigo.Produto;
import view.TelaVenda;

/**
 *
 * @author brunn
 */
public class BrinqueFeliz {
    public static void main(String[] args) throws Exception {
        ConexaoBD  conection = new ConexaoBD();
        conection.abrir();
       
        TelaVenda realizarVenda = new TelaVenda();
        realizarVenda.show();
        
        
    }
}
