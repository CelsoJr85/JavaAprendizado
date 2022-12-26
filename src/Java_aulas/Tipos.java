package Java_aulas;

public class Tipos {
    public static void main(String[] args) throws Exception {
        // Variavél é uma pequena parte de memoria para se guardar algo.
        // Usa o sinal = e um ; no final. ex:  a = 5;

        // Texto
        String nome = "Celso";

        // primários
        int num1 = 4; // inteiro que usa muita memória, pois cabe em números grandes.
        short num2 = 4; // inteiro que usa pouca memória, usado para números menores.

        // não primários
        Integer num3 = 98;
        Short num4 = 7;

        System.out.println("int " + num1);
        System.out.println("short " + num2);
        System.out.println("Interger " + num3);
        System.out.println("Short " + num4);

        // Basico_Sintaxe.Tipos Primários
        float preco1 = 23.4f; // colocar f no final do numero
        double preco2 = 23.4;

        // Basico_Sintaxe.Tipos Não Primários
        Float preco3 = 44.5f; // colocar f no final do numero
        Double preco4 = 44.5;

        System.out.println("float " + preco1);
        System.out.println("double " + preco2);
        System.out.println("Flout " + preco3);
        System.out.println("Double " + preco4);

    }
}
