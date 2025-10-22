public class Recursion_tiling_problem {
    static int tiling_ways(int n) {
       //base case
        if (n == 0 || n == 1){
            return 1;
        }

        //horizontal
        int fnm1 =  tiling_ways(n-2);
         // vertical
        int fnm2 =  tiling_ways(n-1);

        //total ways
        int totalways = fnm1 + fnm2;

        return totalways;

    }
    static void main(String[] args) {

        System.out.println(tiling_ways(1));

    }
}
