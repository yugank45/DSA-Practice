
import java.util.*;

public class Tut_12 {
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int counter = 1;
        while (counter<=input){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

    }
}
