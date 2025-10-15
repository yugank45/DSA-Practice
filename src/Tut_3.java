
import java.util.Scanner;

    public class Tut_3 {
        public static void main(String[] args) {
              System.out.println("Enter the side of the square:" );
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            // System.out.println(input);

          float area = input * input;

            System.out.println("The Area of square is:" +area);
        }
    }

