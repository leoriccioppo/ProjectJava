package exercicios.ToDoList;
//import java.util.Scanner;
import java.time.LocalDate;

public class Tarefa {

    //descrição da tarefa, data de criação, prazo, finalizada
    private String description;
    private LocalDate creationDate;
    private LocalDate deadline;
    private boolean completed;

    public Tarefa(String description, LocalDate creationDate, LocalDate deadline) {
        this.description = description;
        this.completed = false;
        this.creationDate = creationDate;
        this.deadline = deadline;
    }

    //Descrição da tarefa
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    //data de criação 
   public LocalDate getCreationDate() {
    return creationDate;
   }

   public void setCreationDate(LocalDate creationDate){
    this.creationDate = creationDate; 
   }        

   //data de prazo
   public LocalDate getDeadLine(){
    return deadline;
   }

   public void  setDeadLine(LocalDate deadline){
       this.deadline = deadline;
    }

    //
    public boolean isCompleted(){
        return completed;
    }

    public void markAsCompleted(){
       completed = true;
    }



     public static void main(String[] args) {

     }
       
}
