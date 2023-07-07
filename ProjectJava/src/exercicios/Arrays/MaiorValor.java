package exercicios.Arrays;
import java.util.Scanner;

public class MaiorValor {

    static int[] numeros = new int[10];
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {


        //pergunta os números e armazena
        System.out.println("Escolha 10 números, e eu te respondo qual foi o maior!!");

        for(int numero = 0; numero < numeros.length; numero++){
            System.out.println((numero+1)+"° número:");
            numeros[numero] = input.nextInt();
        }

        //perrcore todos os numeros do array e verifica o maior 
        int maiorNumero = numeros[0];
         for(int numero : numeros){
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
         }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
