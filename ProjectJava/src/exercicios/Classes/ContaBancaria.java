package exercicios.Classes;
import java.util.Scanner;


public class ContaBancaria {	
	
	
		private int numero;
		private double saldo;
		private Scanner input;
		
		public ContaBancaria(int numero) {
			this.numero = numero;
			this.saldo = 0.0;	
			this.input = new Scanner(System.in);
		}
		
		
		private void depositar(double valor) {
		System.out.println("Qual valor gostaria de depositar?");
	    valor = input.nextDouble();
		saldo+=valor;
		}
		
	    private void sacar(double valor) {

	        if (valor <= saldo) {
	            saldo -= valor;
	        } else {
	            System.out.println("Saldo insuficiente para saque.");
	        }
	    }

	    private void exibirSaldo() {
	        System.out.println("Saldo atual: " + saldo);
	    }
	    
	    public void operacoes () {
	       System.out.println("Digite a operação desejada (1 \"Depositar\", 2 \"Sacar\", 3 \"Exibir Saldo\", 5 \"Sair\"): ");
           int operador = input.nextInt();
        
	    	
	    	switch(operador) {
	    case 1:
             depositar(5.0);
           break;    
	    case 2:
            sacar(50.0);
            break;
            
	    case 3:
	    	exibirSaldo();
	    	break;
        default:
            System.out.println("Operação inválida.");
            break;
	    }
	    
	}
	    
	    
 }
	
