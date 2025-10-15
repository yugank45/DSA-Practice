
import java.util.*;
public class Tut_18 {
    public static void main(String[] args) {
        System.out.println();
        do {
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            int i= sc.nextInt();
            if (i%10==0){
                System.out.println(i);
                break;
            }
        }while(true);
    }
}
