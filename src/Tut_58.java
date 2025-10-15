
import java.util.*;
public class Tut_58 {
    static void numberpair(int numbers[]){
        int tp = 0;
        for (int i =0;i<numbers.length;i++){

            int current = numbers[i];
            for (int j=i+1 ;j<numbers.length;j++){
                System.out.print("(" + current +","+ numbers[j] + ")");
                tp++;
            }

            System.out.println();

        }
        System.out.print("Total Pairs is "+tp);


    }

    static void main(String[] args) {
        int numbers[] = {2,4,6,8,9,10,1,2,3,3,4,4,5,5,5,66,55};
        numberpair(numbers);
    }

}
