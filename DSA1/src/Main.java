import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Welcome Message: ");
        String welcomeMessage=br.readLine();
        System.out.println(welcomeMessage);
        System.out.println("Thank you and have a good day!");

    }
}
