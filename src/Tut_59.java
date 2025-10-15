
import java.util.*;

public class Tut_59 {
    static void subArray(int numbers[]) {
        int ts = 0;
        int sum = 0;
        for (int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
               int end =j;
                for (int k = start;k<=end;k++){
                    System.out.print(  numbers[k] +" ");
                    sum = sum+numbers[k];
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total Pairs is :"+ts);
        System.out.println("sum of subarrays is"+sum);
    }

    static void main(String[] args) {
        int numbers[] = {2,5,1};
        subArray(numbers);

    }

}
