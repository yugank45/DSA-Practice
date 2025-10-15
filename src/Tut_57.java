import java.util.*;
public class Tut_57 {
    static void reverseNumbers(int numbers[]) {
        int start = 0,end = numbers.length-1;
while (start < end){
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
        start++;
        end--;
}

    }

    static void main(String[] args) {
        int numbers[] = {2,3,5,7,8,9};
        reverseNumbers(numbers);
        for (int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]);
    }
        System.out.println();
    }
}
