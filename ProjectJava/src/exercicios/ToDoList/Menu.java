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
    
        printMenu();
        int opcao = input.nextInt();
     
         
         switch(opcao) {
     case 1:
          addTarefa();
        break;    
     case 2:
         removeTarefa();
         break;
         
     case 3:
         listTarefas();
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

  //printa menu na tela
  public void printMenu(){
    System.out.println("Digite a operação desejada:");
    System.out.println("1-Adicionar tarefa");
    System.out.println("2-Remover tarefa");
    System.out.println("3-Listar tarefa");
    System.out.println("4-Sair");
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

  public void removeTarefa(){
    System.out.println("Tarefa removida");
  }

  public void listTarefas(){
    if (listaTarefas.isEmpty()){
      System.out.println("Nenhuma tarefa na lista!");
    } else{
      System.out.println("Lista de tarefas:");
      for(int i=0; i < listaTarefas.size(); i++){
        Tarefa tarefa = listaTarefas.get(i);
        System.out.println((i+1) + "- "+ tarefa.getDescription());
      }
    }
    
  }
}
