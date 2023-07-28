package exercicios.LivrariaOnline;

import java.util.ArrayList;

import exercicios.LivrariaOnline.livro.Livro;
import exercicios.LivrariaOnline.manipulacao.CarrinhoDeCompras;


public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras estoque = new CarrinhoDeCompras();

                // Exemplo: listar os livros disponíveis no estoque
        ArrayList<Livro> livrosDisponiveis = estoque.getLivros();
        System.out.println("Livros disponíveis no estoque:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro.getTitle() + " - " + livro.getPrice());
        }
        
 }
}

