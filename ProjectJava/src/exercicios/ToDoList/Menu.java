package exercicios.ToDoList;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menu {

    private Scanner input;
    private List<Tarefa> listaTarefas;
    private List<Tarefa> listaTarefasConcluidas;

    public Menu() {
        input = new Scanner(System.in);
        listaTarefas = new ArrayList<>();
        listaTarefasConcluidas = new ArrayList<>();
    }
 
    //printa menu na tela
    public void printMenu(){
      System.out.println("Digite a operação desejada:");
      System.out.println("1-Adicionar tarefa");
      System.out.println("2-Remover tarefa");
      System.out.println("3-Listar tarefa");
      System.out.println("4-Concluir tarefa");
      System.out.println("5-Sair");
    }
    // Solicita informações da tarefa ao usuário
    public void addTarefa(){
      //descrição da tarefa
      System.out.println("Digite a tarefa:");
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
      System.out.println();
    }

    //Remover tarefa selecionada
    public void removeTarefa(){
      System.out.println("Digite a tarefa que deseja remover:");
      int numeroTarefa = input.nextInt();
      input.nextLine();
      
      if(numeroTarefa >= 1 && numeroTarefa <= listaTarefas.size()){
        Tarefa tarefa = listaTarefas.get(numeroTarefa - 1); // Obtenha a tarefa correspondente
        System.out.println("\"" + tarefa.getDescription() + "\"");
        System.out.println("Tem certeza que deseja remover tarefa? (S/N)");
        String confirmacao = input.nextLine();

        if (confirmacao.equalsIgnoreCase("S")) {
          listaTarefas.remove(tarefa);
          System.out.println("Tarefa removida com sucesso!");
          } else {
            System.out.println("Remoção cancelada.");
        }

       }else{
        System.out.println("Número de tarefa inválido.");
      }
      System.out.println();
    }

    //Listar todas as tarefas
    public void listTarefas(){
    if (listaTarefas.isEmpty() && listaTarefasConcluidas.isEmpty()){
      System.out.println("Nenhuma tarefa na lista!");
    } else{
      System.out.println("Prefere exibi-las em que ordem?");
      System.out.println("1-Ordem de criação");
      System.out.println("2-Alfabética");
      System.out.println("3-Data de prazo");
      System.out.println("4-Tarefas concluídas");
      int opcao = input.nextInt();
      System.out.println();

      switch(opcao) {
        case 1:
        listaTarefasOrdemAdicionadas();
        break;

        case 2:
        listTarefasAlfabeto();
        break;

        case 3:
        listTarefasDataPrazo();
        break;

        case 4:
        listTarefasConcluidas();
        break;

        default:
        System.out.println("Operação inválida.");
        break;

      }
    }    
    System.out.println();
   }

    public void listaTarefasOrdemAdicionadas(){
    System.out.println("Lista de tarefas em ordem de criação:");
      for(int i=0; i < listaTarefas.size(); i++){
        Tarefa tarefa = listaTarefas.get(i);
        System.out.println((i+1) + "- "+ tarefa.getDescription() + "  /Prazo de entrega:" + tarefa.getDeadLine());
      }
   }

    public void listTarefasAlfabeto(){
     List<Tarefa> tarefasOrdenadas = new ArrayList<>(listaTarefas);
        tarefasOrdenadas.sort(Comparator.comparing(Tarefa::getDescription));

        System.out.println("Lista de tarefas em ordem alfabética:");
        for (int i = 0; i < tarefasOrdenadas.size(); i++) {
            Tarefa tarefa = tarefasOrdenadas.get(i);
            System.out.println((i + 1) + "- " + tarefa.getDescription() + "  /Prazo de entrega:" + tarefa.getDeadLine());
          }
    }

    public void listTarefasDataPrazo(){
    List<Tarefa> tarefasOrdenadas = new ArrayList<>(listaTarefas);
        tarefasOrdenadas.sort(Comparator.comparing(Tarefa::getDeadLine));

        System.out.println("Lista de tarefas por ordem de prazo:");
        for (int i = 0; i < tarefasOrdenadas.size(); i++) {
            Tarefa tarefa = tarefasOrdenadas.get(i);
            System.out.println((i + 1) + "- " + tarefa.getDescription() + "  /Prazo de entrega:" + tarefa.getDeadLine());
       }
    }

    public void listTarefasConcluidas(){
      if(listaTarefasConcluidas.isEmpty()){
        System.out.println("Nenhuma tarefa na lista!");
      }else{
        System.out.println("Tarefas concluídas:");
        for(int i = 0; i < listaTarefasConcluidas.size(); i++){
          Tarefa tarefa = listaTarefasConcluidas.get(i);
          System.out.println((i+1) + "- " + tarefa.getDescription());
        }
      }
    }
    

    //marcar como concluída
    public void markTarefaConcluida(){
      System.out.println("Digite o número da tarefa que deseja marcar como concluída:");
      for(int i=0; i < listaTarefas.size(); i++){
        Tarefa tarefa = listaTarefas.get(i);
        System.out.println((i+1) + "- "+ tarefa.getDescription());
      }
      int numeroTarefa = input.nextInt();

      if(numeroTarefa>= 1 && numeroTarefa <= listaTarefas.size()){
        Tarefa tarefa = listaTarefas.get(numeroTarefa - 1);
        tarefa.markAsCompleted();
        listaTarefasConcluidas.add(tarefa);
        listaTarefas.remove(tarefa);
        System.out.println("Tarefa marcada como concluída!");
        System.out.println();
      }else{
        System.out.println("Número de tarefa inválido.");
      }

    }

    //getters and setters
    public List<Tarefa> getListaTarefas() {
      return listaTarefas;
   }

    public void setListaTarefas(List<Tarefa> listaTarefas) {
      this.listaTarefas = listaTarefas;
   }
}
