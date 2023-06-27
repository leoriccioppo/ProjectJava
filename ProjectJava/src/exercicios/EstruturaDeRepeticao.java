package exercicios;

public class EstruturaDeRepeticao {
	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
        tabuada.exibirTabuada();
        
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.exibirSequencia();
		
	}
	
	public static class Tabuada {
        public void exibirTabuada() {
            // Lógica para exibir a tabuada 
        	
        	for (int numeroTabuada = 10; numeroTabuada <= 10; numeroTabuada++) {
        		System.out.println("Tabuada do " + numeroTabuada + ":");
        		for (int numeroMultiplicado  = 1; numeroMultiplicado <= 10; numeroMultiplicado++) {
        			int resultado = numeroTabuada * numeroMultiplicado;
                    System.out.println( numeroTabuada + " x " + numeroMultiplicado + " = " + resultado);
                }
                System.out.println(); // Linha em branco para separar as tabuadas
        	}
        }
    }

	
	//Fibonacci
	
	public static class Fibonacci {
        public void exibirSequencia() {
        	
        	int n = 15;
            int primeiroNumero = 0;
            int segundoNumero = 1;
            
            System.out.println("Sequência de Fibonacci:");
            
            System.out.print(primeiroNumero + ", " + segundoNumero);
            
            for (int i = 3; i <= n; i++) {
                int proximoNumero = primeiroNumero + segundoNumero;
                System.out.print(", " + proximoNumero);
                
                primeiroNumero = segundoNumero;
                segundoNumero = proximoNumero;
            
        }
    }

  }
}