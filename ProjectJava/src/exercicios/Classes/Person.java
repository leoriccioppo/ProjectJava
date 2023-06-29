package exercicios.Classes;

public class Person {
    private String nome;
    private int idade;
    
    public Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
    public static void main(String[] args) {
        Person pessoa = new Person("João", 30);
        pessoa.mostrarInformacoes();
    }
}