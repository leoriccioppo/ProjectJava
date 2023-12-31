package exercicios.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class InverteOrdem {

    static int[] numeros = new int[5];
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {

        //armazenando números
        System.out.println("Escolha cinco números:");
        for(int numero=0; numero < numeros.length ; numero++){
            numeros[numero] = input.nextInt();
        }
        
        //ordenando números
        int[] ordemCrescente = numeros.clone();
        int[] ordemDecrescente = numeros.clone();
        int[] numerosSortidos = numeros.clone();

        //método da biblioteca arrays
        Arrays.sort(ordemCrescente);
       shuffleArray(numerosSortidos);
       descrescenteArray(ordemDecrescente);
     
        System.out.println("A ordem crescente dos números é:" + Arrays.toString(ordemCrescente));
        System.out.println("A ordem decrescente dos números é:" + Arrays.toString(ordemDecrescente));
        System.out.println("A ordem aleatória dos números é:" + Arrays.toString(numerosSortidos));
    }

    public static void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void descrescenteArray (int [] array){
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
    }
    
}
