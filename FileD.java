import java.io.FileWriter;
import java.io.File;
import java.io.IOException;  
import java.util.Scanner;
import java.io.FileReader;
public class FileD {  
    public static void main(String[] args){  
        int vo[]={0,0,0,0,0};
        char vot[]={'a','e','i','o','u'};
        File myfile=new File("count.txt");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a line you want to put in the file: "); 
        String str= sc.nextLine();
        try{
            myfile.createNewFile();
            FileWriter myWriter = new FileWriter("count.txt");
            myWriter.write(str);
            myWriter.close();
            FileReader fr=new FileReader("count.txt");
            int i;    
            while((i=fr.read())!=-1){
                if((char)i=='a'||(char)i=='A'){
                    vo[0]=vo[0]+1;
                }
                if((char)i=='e'||(char)i=='E'){
                    vo[1]=vo[1]+1;
                }
                if((char)i=='I'||(char)i=='i'){
                    vo[2]=vo[2]+1;
                }
                if((char)i=='O'||(char)i=='o'){
                    vo[3]=vo[3]+1;
                }
                if((char)i=='u'||(char)i=='U'){
                    vo[4]=vo[4]+1;
                }
            }    
            fr.close();    
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("The number of vowels are:");
        for(int i=0;i<5;i++){
            System.out.print(vot[i]+":"+vo[i]+"\t");
        }
    }
}
