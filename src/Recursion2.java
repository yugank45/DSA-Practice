public class Recursion2 {
    static boolean issorted(int arr[],int i ) {
        if (i == arr.length-1){
            return true;
        }//base case

        if (arr[i] > arr[i+1]){
            return false;
        }

//        if (arr[i] < arr[i+1]){     this prints the sorted array in descending order
//            return false;
//        }

        return issorted(arr,i+1);


    }

    static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(issorted(arr,0));
    }
}
