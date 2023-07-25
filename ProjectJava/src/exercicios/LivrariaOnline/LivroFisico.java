package exercicios.LivrariaOnline;

public class LivroFisico extends Livro{
    public LivroFisico(String title, String author, String isbn, double price) {
        super(title, author, isbn, price);
    }
    private double peso;
    private double precoFrete;

    //getters and setters
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecoFrete() {
        return precoFrete;
    }
    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }
}
