import java.util.Scanner;

public class Tut_4 {
    public static void main(String[] args) {
        // System.out.println("******************Addition of two numbers***********************");
        System.out.println("Enter the cost of pencil:");
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        // System.out.println(input);
        System.out.println("Enter cost of pen:");
        Scanner scanner = new Scanner(System.in);
        float input1 = sc.nextFloat();
        // System.out.println(input1);
        System.out.println("Enter cost of eraser:");
        Scanner scanner1 = new Scanner(System.in);
         float input2=sc.nextFloat();

       float Bill = input+input1+input2;
        float gst = Bill+ (Bill * (18/100f));

        System.out.println("The Total Bill of the product is :" +gst);
    }
}
