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
		
		
		
public void depositar(double valor) {
			try {	
				System.out.println("Qual valor gostaria de depositar?");
			    valor = input.nextDouble();
				saldo+=valor;
				System.out.println("Depósito realizado com sucesso.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Valor inválido. Certifique-se de digitar um número decimal válido.");
        }
}
		
	    
		
public void sacar(double valor) {
			try {
				System.out.print("Qual valor gostaria de sacar? ");
	            valor = input.nextDouble();
	            if (valor <= saldo) {
		            saldo -= valor;
		        } else {
		            System.out.println("Saldo insuficiente para saque.");
		        }
			} catch (java.util.InputMismatchException e) {
	            System.out.println("Valor inválido. Certifique-se de digitar um número decimal válido.");
	        }
	    }



public void exibirSaldo() {
	        System.out.println("Saldo atual: " + saldo);
	    }
	    
	

public void operacoes () {
	boolean continuar = true;
	
	while (continuar) {

	       System.out.println("Digite a operação desejada (1 \"Depositar\", 2 \"Sacar\", 3 \"Exibir Saldo\", 4 \"Sair\"): ");
           int operador = input.nextInt();
        
	    	
	    	switch(operador) {
	    case 1:
             depositar(0.0);
           break;    
	    case 2:
            sacar(0.0);
            break;
            
	    case 3:
	    	exibirSaldo();
	    	break;
	    
	    case 4:
	    	continuar = false;
            System.out.println("Encerrando operações.");
            break;
        
	    default:
            System.out.println("Operação inválida.");
            break;
	    }
	   } 
	}
	   



public static void main(String[] args) {
	        ContaBancaria conta = new ContaBancaria(12345);
	        conta.operacoes();
	    }    
	    
 }
	
