package com.todoList;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Task> tasks = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n=== To-Do List Manager ===");
	            System.out.println("1. Add Task");
	            System.out.println("2. View Tasks");
	            System.out.println("3. Mark Task Completed");
	            System.out.println("4. Delete Task");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	           scanner.nextLine();  // clear buffer

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter task title: ");
	                    String title = scanner.nextLine();
	                    tasks.add(new Task(title));
	                    System.out.println("Task added!");
	                    break;

	                case 2:
	                    if (tasks.isEmpty()) {
	                        System.out.println("No tasks added.");
	                    } else {
	                        System.out.println("Your Tasks:");
	                        for (int i = 0; i < tasks.size(); i++) {
	                            System.out.println((i + 1) + ". " + tasks.get(i));
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter task number to mark complete: ");
	                    int completeIndex = scanner.nextInt() - 1;
	                    if (completeIndex >= 0 && completeIndex < tasks.size()) {
	                        tasks.get(completeIndex).markCompleted();
	                        System.out.println("Task marked as complete!");
	                    } else {
	                        System.out.println("Invalid task number.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter task number to delete: ");
	                    int deleteIndex = scanner.nextInt() - 1;
	                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
	                        tasks.remove(deleteIndex);
	                        System.out.println("Task deleted.");
	                    } else {
	                        System.out.println("Invalid task number.");
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exiting... Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 5);

	        scanner.close();

	}

}
