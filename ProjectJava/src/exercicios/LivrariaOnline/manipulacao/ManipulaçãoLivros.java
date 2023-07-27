package exercicios.LivrariaOnline.manipulacao;
import java.util.ArrayList;

import exercicios.LivrariaOnline.livro.Livro;

public class ManipulaçãoLivros {
     private ArrayList<Livro> livros;

     public ManipulaçãoLivros(){
        livros = new ArrayList<>();
     }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para remover um livro 
    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    // Método para obter a lista de livros 
    public ArrayList<Livro> getLivros() {
        return livros;
    }
}
