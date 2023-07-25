package exercicios.LivrariaOnline;

public class Ebook extends Livro{
    public Ebook(String title, String author, String isbn, double price) {
        super(title, author, isbn, price);
    }

    private double tamanhoEmMb;


    //getters and setters
    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public void setTamanhoEmMb(double tamanhoEmMb) {
        this.tamanhoEmMb = tamanhoEmMb;
    }
    
}
