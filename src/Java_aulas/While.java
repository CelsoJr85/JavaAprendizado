package Java_aulas;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // variável
        int idade = 1;
        String nome;

        // receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);

        while (idade > 0) {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe sua idade: ");
            //idade = teclado.nextInt(); // Bug.
            idade = Integer.parseInt(teclado.nextLine()); // correto
            System.out.println(nome + " tem " + idade + " anos.");
        }

        teclado.close();
    }
}
