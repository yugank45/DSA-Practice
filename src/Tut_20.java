
import java.util.*;

public class Tut_20 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==2){
            System.out.println("It is a prime number");
        }else {
        boolean isPrime = true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%2==0){
                isPrime = false;

            }
        }
        if (isPrime==true) {
            System.out.println("It is a prime number");
        }else {
            System.out.println("It is not a prime number");
        }
    }

    }

}
