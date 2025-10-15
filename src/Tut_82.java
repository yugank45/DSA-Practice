

public class Tut_82 {

    static void printEvenOdd_BitwiseOperator(int n) {
        int bitmask = 1;
        if ((n & bitmask)==0){
            System.out.println("Even number");
        }else
            System.out.println("Odd number");

    }

    static int getithBit(int n,int i) {
        int bitmask = 1<<i;
        if ((n & bitmask)==0){
            return 0;
        }else
            return 1;

    }

    static int clearithBit(int n , int i) {
        int bitmask = ~(1<<i);
        return n&bitmask;

    }

    static int setithBit(int n,int i) {
        int bitmask = 1<<i;
        return n|bitmask;

    }

    static int clearlastibit(int n,int i) {
        int bitmask = ~(0)<<i;
        return n&bitmask;

    }

    static int clearRangeOfBits(int n,int i,int j) {
        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;

        int bitmask = a|b ;
        return n & bitmask;
    }

    static boolean isPowerOf2(int n) {
        return (n&(n-1)) ==0;

    }
    //*********************************************Important Question
    static int countSetBits(int n) {
        int count = 0;
        while (n>0){
          if ((n&1)!=0){
            count++;

        }
        n= n>>1;
        }
        return count;
    }


    static void main() {
        /* System.out.println((5 & 6));
        System.out.println((5|2));
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(5^2);
        *///1010

        printEvenOdd_BitwiseOperator(3);
        printEvenOdd_BitwiseOperator(6);
        System.out.println(getithBit(10,3));;
        System.out.println(setithBit(10,2));;
        System.out.println(clearithBit(10,1));
        System.out.println(clearlastibit(15,2));
        System.out.println(clearRangeOfBits(15,2,7));
        System.out.println(isPowerOf2(41));
        System.out.println(countSetBits(15));
    }
}
