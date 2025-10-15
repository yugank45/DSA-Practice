import java.util.*;


public class Tut_6 {
    public static void main (String[] args){

        System.out.println("***********************Income Tax Calculator************************");
        System.out.println("Enter the income :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);
        if (input < 500000){

            System.out.println("No tax");
        } else if (input > 500000 && input < 1000000) {
            float Salary = (input*20f)/100;
            float Total = input - Salary;
            System.out.println("Your Salary Tax is:"+Salary);
            System.out.println("Your in hand salary is:"+Total);
        } else if (input>1000000) {
            float Salary = (input*30f)/100;
            System.out.println(Salary);
            float Total = input - Salary;
            System.out.println("Your Salary Tax is:"+Salary);
            System.out.println("Your in hand salary is:"+Total);

        }
    }
}
