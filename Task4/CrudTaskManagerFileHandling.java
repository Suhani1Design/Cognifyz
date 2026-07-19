
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class CrudTaskManagerFileHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        // Read old tasks
        try {
            File file = new File("tasks.txt");

            if (file.exists()) {
                Scanner fileReader = new Scanner(file);

                while (fileReader.hasNextLine()) {
                    tasks.add(fileReader.nextLine());
                }

                fileReader.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }

        while (true) {

            System.out.println("\n===== TASK MANAGER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();

                    tasks.add(task);

                    try {
                        FileWriter writer = new FileWriter("tasks.txt");

                        for (String t : tasks) {
                            writer.write(t + "\n");
                        }

                        writer.close();

                    } catch (IOException e) {
                        System.out.println("Error saving task!");
                    }

                    System.out.println("Task Added Successfully!");
                    break;

                case 2:

                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available!");
                    } else {

                        System.out.println("\nYour Tasks:");

                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Task Index: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Task: ");
                    String newTask = sc.nextLine();

                    tasks.set(updateIndex, newTask);

                    try {
                        FileWriter writer = new FileWriter("tasks.txt");

                        for (String t : tasks) {
                            writer.write(t + "\n");
                        }

                        writer.close();

                    } catch (IOException e) {
                        System.out.println("Error saving task!");
                    }

                    System.out.println("Task Updated Successfully!");
                    break;

                case 4:

                    System.out.print("Enter Task Index: ");
                    int deleteIndex = sc.nextInt();

                    tasks.remove(deleteIndex);

                    try {
                        FileWriter writer = new FileWriter("tasks.txt");

                        for (String t : tasks) {
                            writer.write(t + "\n");
                        }

                        writer.close();

                    } catch (IOException e) {
                        System.out.println("Error saving task!");
                    }

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
