package exercicios.LivrariaOnline;

import java.util.ArrayList;
import java.util.Scanner;

import exercicios.LivrariaOnline.livro.Livro;
import exercicios.LivrariaOnline.manipulacao.CarrinhoDeCompras;
import exercicios.LivrariaOnline.manipulacao.Estoque;


public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Estoque estoque = new Estoque();
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println();
            PrintMenu();
            int opcao = input.nextInt();
            input.nextLine();

            System.out.println();


            if(opcao == 1){
                //listar os livros disponíveis no estoque
                ArrayList<Livro> livrosDisponiveis = estoque.getLivros();
                System.out.println("Livros disponíveis no estoque:");
                for (Livro livro : livrosDisponiveis) {
                System.out.println(livro.getTitle() + " - " + livro.getPrice());
            }

            }else if(opcao == 2){
                System.out.println("Digite o livro que deseja adicionar:");
                String title = input.nextLine();

                Livro livroSelecionado = null;

                for(Livro livro : estoque.getLivros()){

                    if (livro.getTitle().equalsIgnoreCase(title)){
                    livroSelecionado = livro;
                    break;
                 }
                } 
                
                if(livroSelecionado != null){
                    carrinho.adicionarLivro(livroSelecionado);
                    System.out.println("Livro \"" + title + "\" adicionado ao carrinho!");
                } else{
                    System.out.println("Livro não encontrado no estoque!");
                }
            }

            else if(opcao == 3){
                System.out.println("Digite o livro que deseja remover:");
                 String title = input.nextLine();
                 Livro livroSelecionado = null;

                if (carrinho.getLivros().size() == 0){
                    System.out.println("Nenhum livro no carrinho!");
                } else{
                     for(Livro livro : carrinho.getLivros()){
                     if (livro.getTitle().equalsIgnoreCase(title)){
                    livroSelecionado = livro;
                    break;
                  }
              }

               if(livroSelecionado != null){
                carrinho.removerLivro(livroSelecionado);
                System.out.println("Livro \"" + title + "\" removido do carrinho!");
               }else{
                System.out.println("Livro não encontrado no carrinho!");
               }
            }

            } else if(opcao == 4){
                //listar os livros no carrinho
                if(carrinho.getLivros().size() == 0){
                    System.out.println("Nenhum livro no carrinho!");
                }else{
                    System.out.println("Listar livros no carrinho");
                    for (Livro livro : carrinho.getLivros()) {
                    System.out.println(livro.getTitle() + " - " + livro.getPrice());
                 }
                }
            }
            else if(opcao == 5){
                System.out.println("Concluir compra");

            }
            else if(opcao == 6){
             exit = true;
             System.out.println("Até a próxima!");

            }else{

            System.out.println("Opção inválida!");

            }
   
        }      
        input.close();
 }


 public static void PrintMenu(){
    System.out.println("O que gostaria de fazer:");
    System.out.println("1-Listar livros disponíveis no estoque");
    System.out.println("2-Adicionar livro ao carrinho");
    System.out.println("3-Remover livro do carrinho");
    System.out.println("4-Listar livros no carrinho");
    System.out.println("5-Concluir compra");
    System.out.println("6-Cancelar e sair");
 }

}

