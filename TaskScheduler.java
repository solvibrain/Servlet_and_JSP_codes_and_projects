import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class TaskScheduler {
    public static void main(String[] args) {
        // Initialize a HashMap to store tasks based on priority
        HashMap<String, ArrayList<String>> tasks = new HashMap<>();
        tasks.put("HIGH", new ArrayList<>());
        tasks.put("MEDIUM", new ArrayList<>());
        tasks.put("LOW", new ArrayList<>());

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Main loop to interact with the user
        while (true) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask(scanner, tasks);
                    break;
                case "2":
                    viewTasks(tasks);
                    break;
                case "3":
                    System.out.println("Exiting Task Scheduler. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    // Function to add a task to the scheduler
    private static void addTask(Scanner scanner, HashMap<String, ArrayList<String>> tasks) {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter priority (High/Medium/Low): ");
        String priority = scanner.nextLine().toUpperCase();

        // Validate the priority input
        if (!tasks.containsKey(priority)) {
            System.out.println("Invalid priority! Task not added.");
            return;
        }

        tasks.get(priority).add(name);
        System.out.println("Task '" + name + "' added with priority '" + priority + "'.");
    }

    // Function to view tasks grouped by priority
    private static void viewTasks(HashMap<String, ArrayList<String>> tasks) {
        System.out.println("\nTasks:");
        for (String priority : tasks.keySet()) {
            System.out.println(priority + " Priority:");
            ArrayList<String> taskList = tasks.get(priority);
            if (taskList.isEmpty()) {
                System.out.println("No tasks.");
            } else {
                for (String task : taskList) {
                    System.out.println("- " + task);
                }
            }
        }
    }
}
