public class Tut_48 {
    public static void _01Triangle(int n) {
       for (int i=1;i<=n;i++){
           for (int j = 1;j<=i;j++){
               if ((i+j)%2==0){
                   System.out.print("1");
               }else
                   System.out.print("0");
           }
           System.out.println();
       }
       for (int i =n;i>=1;i--){
           for (int j = 1;j<=i;j++){
               if ((i+j)%2==0){
                   System.out.print("1");
               }else
                   System.out.print("0");
           }
           System.out.println();
       }
    }

    public static void main(String[] args) {
        _01Triangle(4);
    }
}
