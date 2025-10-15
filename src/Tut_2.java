import java.util.Scanner;

public class Tut_2 {
    public static void main(String[] args) {
       // System.out.println("******************Addition of two numbers***********************");
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // System.out.println(input);
        System.out.println("Enter second number:");
        Scanner scanner = new Scanner(System.in);
        int input1 = sc.nextInt();
        // System.out.println(input1);
        System.out.println("Enter third number:");
        Scanner scanner1 = new Scanner(System.in);
        int input2=sc.nextInt();

        float avg = (float)(input+input1+input2)/3;

        System.out.println("The average of three numbers is:" +avg);
    }
}
