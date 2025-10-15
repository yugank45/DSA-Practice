
import java.util.Scanner;

public class Tut_16 {
 public static void main(String[] args){
     int n = 23345;
     int lastdigit;
     int rev =0;

     while (n>0){
         lastdigit = n%10;
         rev = (rev*10)+lastdigit;//learn rev = rev*10+last digit to get last digit we use n%10 and to remove last digit we use n/10
         n = n/10;

     }
     System.out.println(rev);
 }

}

