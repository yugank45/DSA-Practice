public class Tut_37 {
    public static void binNum(int binNum) {
        int pow = 0;
        int dec = 0;
        int ld;

        while (binNum>0){
        ld = binNum%10;
        dec = dec + (int)(ld*Math.pow(2,pow));
        pow++;
        binNum = binNum/10;
        }
        System.out.println("The decimal no of this binary is "  + dec);
    }
    public static void main(String[] args) {
      binNum(111);
    }
}
