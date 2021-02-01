/* 
 * Sequência secreta (nível junior)
 * OBI2019
 * @author Gustavo Costa de Souza
 */ 

// A classe Scanner facilita a entrada de dados no modo Console
import java.util.Scanner; // Importa a classe Scanner

public class Sequencia_secreta {

    public static void main(String[] args) {
        // Cria um objeto Scanner
        Scanner leitor = new Scanner(System.in); 
        
        // Inicializa o último valor marcado na sequência com um número
        // diferente do valor 1 (primeiro valor da sequência),
        // para que este seja marcado
        int ultimo_valor_marcado = -1;
        
        // Inicializa o total de valores marcados igual a 0, 
        // pois é o elemento neutro da soma
        int total_marcados = 0;
        
        // Lê entrada da sequência pelo usuário
        int tamanho_sequencia = leitor.nextInt(); 
        
        // As linhas seguintes contêm a sequência de números 
        // desenhados no chão da calçada imperial
        for (int i = 1; i <= tamanho_sequencia; i++){
            // Lê o valor desenhado no chão da calçada imperial (1 ou 2)
            int valor_desenhado = leitor.nextInt();
            
            // Cada vez que encontra um número diferente do 
	    // último marcado, marca esse novo número
            if (ultimo_valor_marcado != valor_desenhado){
                
                // Soma a quantidade total de números que 
                // poderiam ser marcados 
                total_marcados += 1;
                
                // O útlimo valor entrado da sequência 
                // passa a ser o último valor marcado
                ultimo_valor_marcado = valor_desenhado;
            }
        }
        
        // Imprime a quantidade máxima de números da sequência 
        // que poderiam ser marcados com um círculo 
        // sem que haja dois números iguais consecutivos na sequência marcada 
        System.out.println(total_marcados);
    }
    
}
