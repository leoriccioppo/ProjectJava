package exercicios.LivrariaOnline;

import java.util.ArrayList;

import exercicios.LivrariaOnline.livro.Livro;
import exercicios.LivrariaOnline.manipulacao.Estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

                // Exemplo: listar os livros disponíveis no estoque
        ArrayList<Livro> livrosDisponiveis = estoque.getLivros();
        System.out.println("Livros disponíveis no estoque:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro.getTitle() + " - " + livro.getPrice());
        }
        
 }
}

