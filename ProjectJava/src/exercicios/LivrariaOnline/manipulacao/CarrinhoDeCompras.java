package exercicios.LivrariaOnline.manipulacao;
import java.util.ArrayList;

import exercicios.LivrariaOnline.livro.Livro;


public class CarrinhoDeCompras extends ManipulaçãoLivros{

    public CarrinhoDeCompras() {
        super(new ArrayList<Livro>());
    }

    public double calcularTotal(){
        double total = 0.0;
        for(Livro livro : livros ){

            total += livro.calcularPrecoTotal();

        }
        return total;
    }

    public void limparCarrinho() {
        livros.clear();
    }
}
