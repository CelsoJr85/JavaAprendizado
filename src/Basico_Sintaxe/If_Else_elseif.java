// If, Else, else if (elif no python)
package Basico_Sintaxe;

public class If_Else_elseif {
    public static void main(String[] args) {
        //Variável
        int numero = 2;

        if(numero > 5){
            System.out.println("Sim, o numero " + numero + " é maior do que 5.");
        } else if (numero == 5) {
            System.out.println("O numero " + numero + " é igual a 5.");
        } else if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par.");
        } else {
            System.out.println("Não, o numero " + numero + " é menor do que 5.");
        }

    }
}
