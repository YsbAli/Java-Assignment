import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputOutput {
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        String Input = reader.readLine();
 
        System.out.println(Input);
    }
}
