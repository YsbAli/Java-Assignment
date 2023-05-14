



// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// class Producer implements Runnable {
//     private Queue<Integer> buffer;
//     private int maxSize;

// // The producer’s job is to generate data, put it into the buffer, and start again.
//     public Producer(Queue<Integer> buffer, int maxSize) {
//         this.buffer = buffer;
//         this.maxSize = maxSize;
//     }

//     public void run() {
//         while (true) {
//             synchronized (buffer) {
//                 while (buffer.size() == maxSize) {
//                     try {
//                         buffer.wait();
//                     } catch (InterruptedException e) {
//                         e.printStackTrace();
//                     }
//                 }
//                 int item = (int) (Math.random() * 10); // Generate a random item
//                 buffer.add(item);
//                 System.out.println("Produced: " + item);
//                 buffer.notifyAll();
//             }
//         }
//     }
// }


// // when producer produce data at the same time, the consumer is consuming the data (i.e. removing it from the buffer), one piece at a time. 

// class Consumer implements Runnable {
//     private Queue<Integer> buffer;

//     public Consumer(Queue<Integer> buffer) {
//         this.buffer = buffer;
//     }

//     public void run() {
//         while (true) {
//             synchronized (buffer) {
//                 while (buffer.isEmpty()) {
//                     try {
//                         buffer.wait();
//                     } catch (InterruptedException e) {
//                         e.printStackTrace();
//                     }
//                 }
//                 int item = buffer.remove();
//                 System.out.println("Consumed: " + item);
//                 buffer.notifyAll();
//             }
//         }
//     }
// }

// public class ProducerConsumer {
//     public static void main(String[] args) {
//         Scanner scannerSc = new Scanner(System.in);

//         System.out.print("Enter the number of producers: ");
//         int numProducers = scannerSc.nextInt();

//         System.out.print("Enter the number of consumers: ");
//         int numConsumers = scannerSc.nextInt();

//         System.out.print("Enter the size of the buffer: ");
//         int bufferSize = scannerSc.nextInt();

//         Queue<Integer> buffer = new LinkedList<>();

//         for (int i = 0; i < numProducers; i++) {
//             Thread producerThread = new Thread(new Producer(buffer, bufferSize));
//             producerThread.start();
//         }

//         for (int i = 0; i < numConsumers; i++) {
//             Thread consumerThread = new Thread(new Consumer(buffer));
//             consumerThread.start();
//         }
//     }
// }












// Java program to implement solution of producer consumer problem.


import java.util.LinkedList;

public class ProducerConsumer {
	public static void main(String[] args)
		throws InterruptedException
	{
		// Object of a class that has both produce()
		// and consume() methods
		final PC pc = new PC();

		// Create producer thread
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.produce();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				try {
					pc.consume();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}

	// This class has a list, producer (adds items to list
	// and consumer (removes items).
	public static class PC {

		// Create a list shared by producer and consumer
		// Size of list is 2.
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		// Function called by producer thread
		public void produce() throws InterruptedException
		{
			int value = 0;
			while (true) {
				synchronized (this)
				{
					// producer thread waits while list
					// is full
					while (list.size() == capacity)
						wait();

					System.out.println("Producer produced-"
									+ value);

					// to insert the jobs in the list
					list.add(value++);

					// notifies the consumer thread that
					// now it can start consuming
					notify();

					// makes the working of program easier
					// to understand
					Thread.sleep(1000);
				}
			}
		}

		// Function called by consumer thread
		public void consume() throws InterruptedException
		{
			while (true) {
				synchronized (this)
				{
					// consumer thread waits while list
					// is empty
					while (list.size() == 0)
						wait();

					// to retrieve the first job in the list
					int val = list.removeFirst();

					System.out.println("Consumer consumed-"
									+ val);

					// Wake up producer thread
					notify();

					// and sleep
					Thread.sleep(1000);
				}
			}
		}
	}
}
