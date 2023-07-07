package exercicios.Arrays;
import java.util.Scanner;

public class MediaTemperatura {
   //cria o array pros 7 dias da semana
    static double[] temperaturas = new double[7];
    static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {

         System.out.println("Vamos calcular a média de temperatura da semana!");

         //pergunta e armazena as temperaturas no array 
         for( int i = 0; i < temperaturas.length; i++){
            System.out.println("Digite a " +(i+1)+ "° temperatura:");
            temperaturas[i]= input.nextDouble();
         }

         //soma as temperaturas
         double soma=0;
         for(int temperatura = 0; temperatura <temperaturas.length; temperatura++){
            soma += temperaturas[temperatura];
         }

         //média das temperaturas 
         double media = soma/7;


          System.out.println("A média das temperaturas é: "+media);

    }
    
}
   
