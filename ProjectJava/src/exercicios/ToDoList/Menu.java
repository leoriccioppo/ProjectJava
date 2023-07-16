package exercicios.ToDoList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private Scanner input;
    private boolean exit;
    private List<Tarefa> listaTarefas;

    public Menu() {
        input = new Scanner(System.in);
        exit = false;
        listaTarefas = new ArrayList<>();
    }

    public void run() {

    Scanner input = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
    
        System.out.println("Digite a operação desejada (1 \"Adicionar tarefa\", 2 \"Remover tarefa\", 3 \"Exibir Saldo\", 4 \"Sair\"): ");
        int opcao = input.nextInt();
     
         
         switch(opcao) {
     case 1:
          addTarefa();
        break;    
     case 2:
         System.out.println("Remover tarefa");
         break;
         
     case 3:
         System.out.println("Listar tarefas");
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

  // Solicita informações da tarefa ao usuário
  public void addTarefa(){
    //descrição da tarefa
    System.out.println("Digite a tarefa:");
    input.nextLine();
    String description = input.nextLine();

    //dia de criação
    System.out.println("Digite a data de criação da tarefa (formato: YYYY-MM-DD): ");
    String dataCriacaoStr = input.nextLine();
    LocalDate creationDate = LocalDate.parse(dataCriacaoStr);

    //prazo
    System.out.println("Digite a data de prazo da tarefa (formato: YYYY-MM-DD): ");
    String dataPrazoStr = input.nextLine();
    LocalDate deadline = LocalDate.parse(dataPrazoStr);

    // Criar instância da tarefa
    Tarefa tarefa = new Tarefa(description, creationDate, deadline);

    //Adicionar tarefa
    listaTarefas.add(tarefa);
    System.out.println("Tarefa adicionada com sucesso!");
  }
}
