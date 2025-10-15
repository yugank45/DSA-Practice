import java.util.*;

public class Tut_30 {
    public static void calculateSum(int a, int b){    //int a ,int b are parameters
        int sum = a + b;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        calculateSum(a,b); // a,b are arguments which are actual parameters


        // function call

    }
}
