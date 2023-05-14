//Write a program to implement the priority of a thread.

import java.util.Scanner;

class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread " + getName() + " is running with priority " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name for Thread 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the priority for Thread 1 (1-10): ");
        int priority1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the name for Thread 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the priority for Thread 2 (1-10): ");
        int priority2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the name for Thread 3: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter the priority for Thread 3 (1-10): ");
        int priority3 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create thread instances
        MyThread thread1 = new MyThread(name1, priority1);
        MyThread thread2 = new MyThread(name2, priority2);
        MyThread thread3 = new MyThread(name3, priority3);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        scanner.close();
    }
}



