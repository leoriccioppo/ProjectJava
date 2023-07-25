package exercicios.LivrariaOnline;

public class LivroFisico extends Livro{
    public LivroFisico(String title, String author, String isbn, double price) {
        super(title, author, isbn, price);
    }
    private double peso;
    private double precoFrete;
}
