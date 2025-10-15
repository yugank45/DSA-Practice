import java.util.*;

public class Tut_55 {
    static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0;i<numbers.length;i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        System.out.println("The smallest number is "+smallest);
        return largest ;

    }

    static void main(String[] args) {
        int numbers[] = {1,2,6,5,7,4};
        System.out.println("The largest number is "+getlargest(numbers));

    }
    
}
