package codigo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ComprovanteVenda {

    private String nomeLoja;
    private float valorUnitario;
    private float valorTotal;
    //private array produtos;
    private String cpf;
    
    public void emitirComprovante(float valorTotal, int produtos, String cpf) throws IOException {
        String dados = "CPF: "+cpf+ "\nvalor total: "+valorTotal;
        try (FileWriter arq = new FileWriter("d:\\arquivo.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.print(dados);
            System.out.println("\nArquivo do foi gravada com sucesso em d:\\arquivo.txt\n");
        }
    }

}
