package exercicios.ToDoList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        boolean exit = false;
    
        while (!exit) {
        
            menu.printMenu();
            int opcao = input.nextInt();
            System.out.println();
         
             
             switch(opcao) {
         case 1:
              menu.addTarefa();
            break;    
         case 2:
             menu.removeTarefa();
             break;
             
         case 3:
             menu.listTarefas();
             break;
        
         case 4:
             menu.markTarefaConcluida();
             break;
         
         case 5:
             exit = true;
             System.out.println("Até a próxima!");
             break;
         
         default:
             System.out.println("Operação inválida.");
             break;
         }
        } 
        input.close();
      }  
   
}
