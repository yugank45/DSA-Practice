

//In Built Sort Method
import java.util.Collections;
import  java.util.Arrays;
import java.util.Collections;

public class Tut_70 {


        static void insertionSort(Integer arr[]) {

            for (int i = 1;i<arr.length;i++){
                int curr = arr[i];
                int prev = i-1;

                while (prev>=0 &&  arr[prev] > curr){
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                //insertion
                arr[prev+1] = curr;

            }

            //swap



        }

        static void printArray(Integer arr[]) {
            for (int  i =0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();


        }
        static void main(String[] args) {
            Integer arr[] = {5,4,1,3,7};
            //insertionSort(arr);
            //Arrays.sort(arr);
           //Arrays.sort(arr,0,3);
          // Arrays.sort(arr,Collections.reverseOrder() );
           //Arrays.sort(arr,0,5,Collections.reverseOrder());
            printArray(arr);
        }
    }


