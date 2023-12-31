package exercicios.LivrariaOnline.manipulacao;
import java.util.ArrayList;

import exercicios.LivrariaOnline.livro.Livro;

public class ManipulaçãoLivros {
     public ArrayList<Livro> livros;

     public ManipulaçãoLivros(ArrayList<Livro> livros){
        this.livros = livros;
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
