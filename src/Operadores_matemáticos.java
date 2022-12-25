public class Operadores_matemáticos {
    public static void main(String[] args) {
        int num1 = 5, num2 = 9, res;
        float res2;

        // soma
        res = num1 + num2;
        System.out.println("resultado de " + num1 + " + " + num2 + " é: " + res);

        // subtração
        res = num1 - num2;
        System.out.println("resultado de " + num1 + " - " + num2 + " é: " + res);

        // multiplicação
        res = num1 * num2;
        System.out.println("resultado de " + num1 + " * " + num2 + " é: " + res);

        // divisão inteiro
        res = num2 / num1;
        System.out.println("resultado de " + num2 + " / " + num1 + " é: " + res);

        // divisão real
        res2 = (float)num2 / (float)num1;
        System.out.println("resultado de " + num2 + " / " + num1 + " é: " + res2);

        // modulo
        // 1 == impar e 2 == par
        res = num1 % 2;
        System.out.println("resultado da divisão de " + num1 + " por 2 é: " + res);

        res = num2 % 3;
        System.out.println("resultado da divisão de " + num2 + " por 3 é: " + res);
    }
}
