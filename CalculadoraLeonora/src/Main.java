import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            Calculadora calculadora = new Calculadora();

            System.out.println("Digite o primeiro número: ");
            double numero1 = input.nextDouble();
            calculadora.setNumero1(numero1);

            System.out.println("Digite a operação desejada (+ \"adição\", - \"subtração\", * \"multiplicação\", / \"divisão\"): ");
            char operador = input.next().charAt(0);
            calculadora.setOperador(operador);

            System.out.println("Digite o segundo número: ");
            double numero2 = input.nextDouble();
            calculadora.setNumero2(numero2);

            double resultado = calculadora.calcular();

            System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
        } finally {
            input.close();
        }
    }
}
