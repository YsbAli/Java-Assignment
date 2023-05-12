import java.util.Scanner;
class zeroException extends Exception{  
    zeroException(String s){  
  		super(s);  
 	}  
}  
class CustomException{  
   	static void validate(int num)throws zeroException{  
     		if(num==0)  
      			throw new zeroException("not valid");  
     		else  
      			System.out.println("thats correct");  
   	}
   	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
      		try{  
			int num;
			System.out.println("enter a number that is not zero:");
      			num=sc.nextInt();
			validate(num);  
      		}
		catch(Exception m){
			System.out.println("Exception occured: "+m);
		}
  	}  
}  
