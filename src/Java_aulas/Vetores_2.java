package Java_aulas;

public class Vetores_2 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        System.out.println("Tamanho do vetor: " + numeros.length);

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3;
        }
        System.out.println(numeros[0]); // primeiro item
        System.out.println(numeros[9]); // ultimo item
    }
}
