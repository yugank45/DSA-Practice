
import java.util.*;
public class Tut_80 {
    static int printLowercase(String str) {
        int count = 0;

        for (int i=0;i<str.length();i++ ){
          char ch = str.charAt(i);
          if (Character.isLowerCase(ch)){
              count++;
          }


        }
        return count;
    }
    static void main(String[] args) {
     String str = "Yugank Singh";
     int lowercase = printLowercase(str);
        System.out.println(lowercase);
    }
}
