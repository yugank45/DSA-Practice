public class Recursion1 {
    static void dec_numPrint(int n) {
        if (n == 1){
            System.out.print(n);
            return ;
        }

        System.out.print(n + " ");
        dec_numPrint(n-1);


    }
    static void inc_numPrint(int n) {

        if (n == 1){
            System.out.print("\n"+ n + " ");
            return ;
        }
        inc_numPrint(n-1);
        System.out.print(n + " ");


    }

    static int factorial(int n) {
        if (n == 0){
           return 1;
        }


        int fn = n * factorial(n-1);
        return fn;
    }
    static void main(String[] args) {
        int n = 6;
    dec_numPrint(n);
        inc_numPrint(n);
        System.out.println(factorial(n));;
    }
}
