class MultiThread extends Thread{  
    public void run(){  
          System.out.println("running thread name is:"+Thread.currentThread().getName());   
     }  
    public static void main(String args[]){  
        MultiThread m1=new MultiThread();  
        MultiThread m2=new MultiThread();  
        MultiThread m3=new MultiThread();  
         m1.start();  
         m2.start(); 
         m3.start(); 
    }  
}     
