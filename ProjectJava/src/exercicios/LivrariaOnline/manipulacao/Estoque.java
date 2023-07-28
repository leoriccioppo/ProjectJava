package exercicios.LivrariaOnline.manipulacao;
import java.util.ArrayList;
import exercicios.LivrariaOnline.livro.Livro;
import exercicios.LivrariaOnline.livro.Ebook;
import exercicios.LivrariaOnline.livro.LivroFisico;

public class Estoque extends ManipulaçãoLivros {

    public Estoque() {
        super(new ArrayList<Livro>()); // Chama o construtor da classe pai com uma lista vazia de livros
        livrosIniciais(); // Adiciona os livros iniciais ao estoque
    }

    private void livrosIniciais() {

        Ebook livroEbook1 = new Ebook("Café com Deus pai", "Junior Rostirola", "ISBN 1", 29.90, 2.5);
        LivroFisico livroFisico1 = new LivroFisico("É assim que acaba", "Colleen Hoover", "ISBN 2", 39.90, 1.2, 5.00);
        LivroFisico livroFisico2 = new LivroFisico("O poder da autorresponsabilidade", "Paulo Vieira", "ISBN 3", 49.90, 1.2, 5.00);
        LivroFisico livroFisico3 = new LivroFisico("Onde estão as flores", "Ilko Minev", "ISBN 4", 49.90, 1.2, 5.00);
        Ebook livroEbook2 = new Ebook("Rita Lee - outra autobiografia", "Rita Lee", "ISBN 5", 19.90, 2.5);

        adicionarLivro(livroEbook1);
        adicionarLivro(livroFisico1);
        adicionarLivro(livroFisico2);
        adicionarLivro(livroFisico3);
        adicionarLivro(livroEbook2);
            
        }


    }

