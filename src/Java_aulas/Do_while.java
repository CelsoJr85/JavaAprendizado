// Do while
// faz a execução e checa depois
package Java_aulas;
import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        // variável
        int idade;
        String nome;

        // receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

         do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());
            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        }while (idade > 0);

        teclado.close();
    }
}
