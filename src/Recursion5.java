public class Recursion5 {
    static int OptimizedPowerCalc(int a,int n) {
        if (n == 0){
            return 1;
        }
        int half_square = OptimizedPowerCalc(a,n/2);
        int optimise_value = half_square * half_square;

        if (n % 2 != 0){
            optimise_value = a * optimise_value;
        }
        return optimise_value;

    }
    static void main(String[] args) {
        int a = 2;
        int n = 5;

        System.out.println( OptimizedPowerCalc(a,n));
    }
}
