
import java.util.Scanner;
public class Tut_32 {
    public static int multiply(int a,int b) {

        int result = a*b;
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Enter first num:");
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter second num:");
        Scanner sc =new Scanner(System.in);
        int b = sc.nextInt();


       int result= multiply(a,b);

        System.out.println("result is " + result);
    }
}
