public class Tut_60 {
        static void MaxSumSubArray(int numbers[]) {
            int maxSum = 0;
            int currSum = 0;
            for (int i=0;i<numbers.length;i++){
                int start=i;

                for (int j=i;j<numbers.length;j++){
                    int end =j;
                    currSum = 0;
                    for (int k = start;k<=end;k++){

                        currSum = currSum+numbers[k];
                    }

                    System.out.println(currSum);
                    if (maxSum<currSum){
                        maxSum = currSum;
                    }


                }
                System.out.println();

            }

            System.out.println("The Max Sum of the Subarrays is:"+maxSum);
        }

        static void main(String[] args) {
            int numbers[] = {2,5,1};
            MaxSumSubArray(numbers);

        }

    }


