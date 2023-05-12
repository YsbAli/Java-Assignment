import java.io.FileWriter;
import java.io.File;
import java.io.IOException;  
import java.util.Scanner;
import java.io.FileReader;

public class Upper {  
    public static void main(String[] args){  
        String txt="";
        File myfile=new File("count.txt");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a line you want to put in the file: "); 
        String str= sc.nextLine();
        try{
            myfile.createNewFile();
            FileWriter myWriter = new FileWriter("Upper.txt");
            myWriter.write(str);
            myWriter.close();
            FileReader fr=new FileReader("Upper.txt");
            int i;    
            while((i=fr.read())!=-1){
                txt+=(char)i;
            }    
            fr.close();   
            txt=txt.toUpperCase();
            FileWriter myWriter2 = new FileWriter("Upper.txt");
            myWriter2.write(txt);
            myWriter2.close(); 
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for(int i=0;i<5;i++){
            
        }
    }
}
