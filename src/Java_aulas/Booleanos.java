package Java_aulas;

public class Booleanos {
    public static void main(String[] args) {
        // tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        // tipos não primitivos
        boolean v = true;
        boolean f = false;

        System.out.println("verdadeiro " + verdadeiro);
        System.out.println("falso " + falso);
        System.out.println("v " + v);
        System.out.println("f " + f);

        // exemplos
        boolean ativo = true;
        if (ativo) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("acesso negado");
        }
    }
}
