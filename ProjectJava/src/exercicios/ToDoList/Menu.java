package exercicios.ToDoList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
    
        System.out.println("Digite a operação desejada (1 \"Adicionar tarefa\", 2 \"Remover tarefa\", 3 \"Exibir Saldo\", 4 \"Sair\"): ");
        int opcao = input.nextInt();
     
         
         switch(opcao) {
     case 1:
          System.out.println("Adicionar tarefa");
        break;    
     case 2:
         System.out.println("Remover tarefa");
         break;
         
     case 3:
         System.out.println("Listar tarefas");;
         break;
     
     case 4:
         exit = true;
         System.out.println("Sair.");
         break;
     
     default:
         System.out.println("Operação inválida.");
         break;
     }
    } 
    input.close();
  }   
}
