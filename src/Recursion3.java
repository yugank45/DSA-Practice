
//wap to find the first occurence of a key value in a array

public class Recursion3 {
    static int first_Occurence(int arr[] ,int i ,int key) {
        if (i == arr.length){
            return -1;     // not found
        }

        if (arr[i] == key){
            return i;
        }
        return first_Occurence(arr , i+1 ,key );

    }
    static void main(String[] args) {

        int arr[] = {8,3,2,24,5,6,77,7,8,8,9};
        System.out.println(first_Occurence(arr,0,9));
    }
}
