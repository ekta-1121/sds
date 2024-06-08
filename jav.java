/*import java.util.Scanner;;
public class jav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
      String name= sc.nextLine();
        System.out.println("enter age:");
       int age= sc.nextInt();
       sc.nextLine();
        System.out.println("enter grade");
      char  grade=sc.nextLine().charAt(0);
        System.out.println("enter percentage:");
        float percent=sc.nextFloat();


        System.out.println("name is: "+name);
        System.out.println("age is: "+age);
        System.out.println("grade is: "+grade);
        System.out.println("percentage is: "+percent);
    }
}*/

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class jav {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enetr name:");
        String name=br.readLine();
        System.out.println("enter age:");
        int age=Integer.parseInt(br.readLine());

        System.out.println("ENTER PERCENT:");
        float percent=Float.parseFloat(br.readLine());

        System.out.println("enter grade:");
        char grade=br.readLine().charAt(0);


        System.out.println();

        System.out.println("name is: "+name);
        System.out.println("age is: "+age);
        System.out.println("percentage is: "+percent);
        System.out.println("grad is: "+grade);

    }
}
*/

import java.util.Scanner;
import java.util.StringTokenizer;
public class jav {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter name,age,grade,percent:");
    String data=sc.nextLine();

    StringTokenizer st=new StringTokenizer(data,",");

    String name=st.nextToken();
    int age=Integer.parseInt(st.nextToken());
    char grade=st.nextToken().charAt(0);
    float percent=Float.parseFloat(st.nextToken());

    System.out.println("name is "+name+" age is "+age+" grade is "+grade+" and percent is "+percent);

}
    
}