package Projeto2_Banco;

import Projeto2_Banco.Cliente;
import Projeto2_Banco.Conta;

import java.util.Scanner;

public class BancoCelso {

    static Cliente cliente = new Cliente("Celso", "Rua um, 85");
    static Conta conta = new Conta(1, 100, 200, cliente);
    static Scanner teclado = new Scanner(System.in);

    public static void depositar(){
        System.out.println("======== DEPÓSITO =========");
        System.out.println("Valor do depósito: ");
        float valor = teclado.nextFloat();
        if (valor>0) {
            conta.depositar(valor);
            System.out.println("Valor foi depositado.");
        } else {
            System.out.println("Valor tem que ser positivo.");
        }
    }

    public static void sacar(){
        System.out.println("========= SAQUE ===========");
        System.out.println("Valor do saque: ");
        float valor = teclado.nextFloat();
        if (valor>0) {
            conta.sacar(valor);
        } else {
            System.out.println("Valor tem que ser positivo.");
        }
    }

    public static void consultar(){
        System.out.println("Seu saldo é: " + conta.getSaldo());
    }

    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Bem-vindo(a) ao Banco Verde");

        do {
            System.out.println("---------------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar");
            System.out.println("0 - Sair");
            System.out.println("---------------------------");
            System.out.println("SELECIONE UMA OPÇÃO: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    consultar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao > 0);

        teclado.close();
    }
}
