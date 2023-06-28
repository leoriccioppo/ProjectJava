package exercicios;

public class ClassesExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa("Leonora", 29);
        pessoa.mostrarInformacoes();

	}
	
	public static class Pessoa{
		private String nome;
		private int idade;
		
		 public Pessoa(String nome, int idade) {
		        this.nome = nome;
		        this.idade = idade;
		    }
		 
		    public void mostrarInformacoes() {
		        System.out.println("Nome: " + nome);
		        System.out.println("Idade: " + idade);
		    }
		
	}
	
	
	
	
	public static class ContaBancaria {
		
	}

}
