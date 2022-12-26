package Java_aulas;

public class Alfanumericos {
    public static void main(String[] args) {
        // tipos primitivos
        char letra1 = 'a'; // aspas simples
        char letra2 = 97; // 97 em decimal == 'a'
        System.out.println("letra2 " + letra2);
        letra2 = (char)(letra2 + 1); //cast
        System.out.println("letra1 " + letra1);
        System.out.println("letra2 " + letra2);

        // tipos não primitivos
        Character letra3 = 'A';
        String nome = "Geek University";
        System.out.println("letra3 " + letra3);
        System.out.println("char/Character " + Character.SIZE + " bits");
        System.out.println("valor min char/Character " + Character.MIN_VALUE); // 0
        System.out.println("valor max char/Character " + Character.MAX_VALUE); //65535
        System.out.println("Nome " + nome);
        System.out.println("Tamanho da String: " + nome.length());
        System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
    }
}
