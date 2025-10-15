import java.util.Scanner;

public class Tut_13 {



        public static void main(String[] args){
            System.out.println("Enter number");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int sum = 0;
            int counter = 1;

            while (counter<=input){

                sum = sum +counter;

                counter++;

            }
            System.out.print(sum + " ");

        }
    }



