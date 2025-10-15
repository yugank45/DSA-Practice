
import java.util.*;
public class Tut_56 {
    static int binarySearch(int numbers[],int key) {
        int start = 0 ,end = numbers.length-1;
        while (start<=end){
            int mid = (start+end)/2;

            if (numbers[mid] == key){
                return mid;
            }
            if (numbers[mid] < key){
                start = mid+1;

            }else{
                end = mid  -1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        //1st half end = mid-1
        // 2nd half start = mid+1
        //key = 10
        int numbers[] = {2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Index of the key is "+binarySearch(numbers,key));
    }
}
