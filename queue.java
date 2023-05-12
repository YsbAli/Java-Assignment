import java.util.Scanner;

public class queue {
    int SIZE ;
    int items[] ;
    int front, rear;
  
    queue(int size) {
        items=new int[size];
        SIZE=size;
        front = -1;
        rear = -1;
    }
  
    boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }
  
    boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
  
    void enQueue(int element) {
  
      if (isFull()) {
        System.out.println("Queue is full");
      }
      else {
        if (front == -1) {
          front = 0;
        }
  
        rear++;
        items[rear] = element;
        System.out.println("Insert " + element);
      }
    }
  
    int deQueue() {
      int element;
  
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      }
      else {
        element = items[front];
  
        if (front >= rear) {
          front = -1;
          rear = -1;
        }
        else {
          front++;
        }
        System.out.println( element + " Deleted");
        return (element);
      }
    }

    void display() {
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      }
      else {
        System.out.println("\nFront index-> " + front);

        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");

        System.out.println("\nRear index-> " + rear);
      }
    }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the Queue");
        int a= sc.nextInt();  
        queue q = new queue(a);
        while (true){
            System.out.println("\n\nEnter your choice");
            System.out.println("1.EnQueue");
            System.out.println("2.DeQueue");
            System.out.println("3.exit");
            a=sc.nextInt();
            switch(a) {
                case 1:
                    System.out.println("enter the number you want to put in the Queue");
                    int b=sc.nextInt();
                    q.enQueue(b);
                    System.out.print("Queue: ");
                    q.display();
                    break;
                case 2:
                    q.deQueue();
                    System.out.println("\nAfter EnQueue\nQueue:");
                    q.display();
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