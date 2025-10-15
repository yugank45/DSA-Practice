public class Tut_46 {
    public static void invertedHalf_pyramid_with_numbers (int n){
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        invertedHalf_pyramid_with_numbers(5);
    }
}
