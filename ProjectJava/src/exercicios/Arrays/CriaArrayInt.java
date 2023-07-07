package exercicios.Arrays;
import java.util.Scanner;


public class CriaArrayInt {
    static int[] numeros = new int[8];
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
	       for (int i=0; i < numeros.length; i++){
            System.out.println("Digite o " +(i+1)+ "° número:");
            numeros[i] = input.nextInt();
           }

           int resultado=0;

           for(int i=0; i < numeros.length; i++){
            resultado+=numeros[i];
           }

           System.out.println("A soma dos números é:" + resultado);
 }    
}

	    
 