//Write a java Program to implement a Stack

import java.util.Scanner;

class stack {

    private int arr[];
    private int top;
    private int capacity;
  
    stack(int size) {
      arr = new int[size];
      capacity = size;
      top = -1;
    }
  
    public void push(int x) {
      if (isFull()) {
        System.out.println("Stack OverFlow");
  
        System.exit(1);
      }
  
      System.out.println("Inserting " + x);
      arr[++top] = x;
    }
  
    public int pop(){
  
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        System.exit(1);
      }
  
      return arr[top--];
    }
  
    public int getSize(){
      return top + 1;
    }
  
    public Boolean isEmpty(){
      return top == -1;
    }
  
    public Boolean isFull(){
      return top == capacity - 1;
    }
  
    public void printStack(){
      for (int i = 0; i <= top; i++) {
        System.out.print(arr[i] + ", ");
      }
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int a = sc.nextInt();  
        stack stack = new stack(a);
        while (true){
            System.out.println("\n\nEnter your choice");
            System.out.println("1.push into stack");
            System.out.println("2.pop into stack");
            System.out.println("3.exit");
            a=sc.nextInt();
            switch(a) {
                case 1:
                    System.out.println("enter the number you want to push");
                    int b=sc.nextInt();
                    stack.push(b);
                    System.out.print("Stack:-> ");
                    stack.printStack();
                    break;
                case 2:
                    stack.pop();
                    System.out.println("\nAfter popping out\nStack:->");
                    stack.printStack();
                  break;
                case 3:
                    System.exit(0);
                break;
                default:
                  System.out.println("wrong input!!!");
              }
        } 
    }
  }
