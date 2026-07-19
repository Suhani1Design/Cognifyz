import java.util.Scanner;
import java.util.ArrayList;

public class CrudTaskManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while(true){
        System.out.println("====== Task Manager ======");
        System.out.println("1. Add Task");
        System.out.println("2. View Task");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice :");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                sc.nextLine();
                System.out.println("Enter Task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task Added Successfully!");
                break;

            case 2:
                if(tasks.size()==0){
                    System.out.println("No Tasks Available!");
                }
                else{
                  for(int i =0;i<tasks.size();i++){
                       System.out.println(i + "." + tasks.get(i));
                  }
                }
                break;
            case 3:
                System.out.println("Enter Task index :");
                int updateindex = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter New Task :");
                String newTask = sc.nextLine();
                tasks.set(updateindex,newTask);
                System.out.println("Task Updated Successfully!");
                break;
            case 4:
                System.out.println("Enter Task index:");
                int deleteindex = sc.nextInt();
                tasks.remove(deleteindex);
                System.out.println("Task Deleted Successfully!");
                break;
            case 5:
                System.out.println("Thank You!");
                sc.close();
                return;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}   
}

