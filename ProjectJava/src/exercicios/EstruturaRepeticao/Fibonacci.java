package exercicios.EstruturaRepeticao;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
