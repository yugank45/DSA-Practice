public class Tut_61 {
    static void maxSubArrayPrefixMethod(int numbers[]) {
       int maxSum = 0;
       int currSum = 0;
       int prefix[] = new int[numbers.length];
       prefix[0] = numbers[0];
       for (int i = 1;i< numbers.length;i++){
           prefix[i] = prefix[i-1] + numbers[i];
       }
       for (int i =0;i< numbers.length;i++){
           int start= i;

           for (int j = i;j< numbers.length;j++){
                currSum = 0;
               int end = j;

               currSum = start== 0?prefix[end]:prefix[end] - prefix[start-1];


           }
        if (maxSum<currSum){
            maxSum = currSum;
        }

       }
        System.out.println("The maximum sum is "+maxSum);
    }

    static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubArrayPrefixMethod(numbers);
    }
}
