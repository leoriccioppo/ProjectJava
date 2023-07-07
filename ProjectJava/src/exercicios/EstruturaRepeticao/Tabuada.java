package exercicios.EstruturaRepeticao;

public class Tabuada {

	public static void main(String[] args) {
		
		for (int numeroTabuada = 1; numeroTabuada <= 10; numeroTabuada++) {
    		System.out.println("Tabuada do " + numeroTabuada + ":");
    		for (int numeroMultiplicado  = 1; numeroMultiplicado <= 10; numeroMultiplicado++) {
    			int resultado = numeroTabuada * numeroMultiplicado;
                System.out.println( numeroTabuada + " x " + numeroMultiplicado + " = " + resultado);
            }
            System.out.println(); // Linha em branco para separar as tabuadas
    	}

	}

}
