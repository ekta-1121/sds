import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your percentage");
        float per = sc.nextFloat();

        sc.nextLine();

        System.out.println("Enter your grade");
        char grade = sc.nextLine().charAt(0);



        System.out.println("Welcome " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your percentage is " + per);
        System.out.println("Your grade is " + grade);

        
    }
}