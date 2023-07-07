package exercicios.Arrays;
import java.util.Scanner;

public class MenorValor {

    static int[] numeros = new int[10];
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        //pergunta os números e armazena
        System.out.println("Escolha 10 números, e eu te respondo qual foi o menor!!");

        for (int numero =0; numero < numeros.length; numero++){
            System.out.println("Digite o " +(numero+1)+"° número:");
            numeros[numero] = input.nextInt();
        }

        int menorNumero=numeros[0];
        for( int numero : numeros){
            if (numero < menorNumero){
                menorNumero = numero;
            }
        }

         System.out.println("O menor número é:" +menorNumero);
    }
}
