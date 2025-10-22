public class Recursion4 {
    static int  lastOccurrence(int arr[],int key,int i) {
        if (i == arr.length){
            return -1;
        }
        int isfound =  lastOccurrence(arr , key ,i+1);
        if (isfound == -1 && arr[i] == key){
            return i;
        }
           return isfound;

    }

    static void main(String[] args) {
        int arr[] = {1,2,3,4,7,88,66,44,5,6,7,7};
        System.out.println(lastOccurrence(arr , 7,0));;

    }
}

