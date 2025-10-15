import java.util.Scanner;

public class Tut_11 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int a =sc.nextInt();

        if(a%4 == 0){
            if (a%100 == 0){
                if (a%400 == 0){

                }
            }
            System.out.println("It is a Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }


    }
}
