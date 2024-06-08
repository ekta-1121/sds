import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


       System.out.println("Enter your name");
       String name = br.readLine();

       System.out.println("Enter your age");
       int age = Integer.parseInt(br.readLine());

       System.out.println("Enter percentage");
       float per = Float.parseFloat(br.readLine());

       System.out.println("Enter your grae");
       char grade = br.readLine().charAt(0);



       System.out.println(name);
       System.out.println(age);
       System.out.println(per);
       System.out.println(grade);
    }
    
}
