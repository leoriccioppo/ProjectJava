package exercicios.ToDoList;
import java.util.Scanner;

public class Tarefas {

    static Scanner input = new Scanner(System.in);
    boolean menu = true;



    public void menu () {
        
        while (menu) {
    
               System.out.println("Digite a operação desejada (1 \"Adicionar tarefa\", 2 \"Remover tarefa\", 3 \"Exibir Saldo\", 4 \"Sair\"): ");
               int operador = input.nextInt();
            
                
                switch(operador) {
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
                menu = false;
                System.out.println("Sair.");
                break;
            
            default:
                System.out.println("Operação inválida.");
                break;
            }

           } 
        }
    

     public static void main(String[] args) {

        Tarefas tarefas = new Tarefas();
        tarefas.menu();
     }
       
}
