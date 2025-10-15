

import java.util.Scanner;
public class Tut_15 {

        public static void main(String[] args){
            int n = 78900;
            while (n>0) {
                int lastdigit = n   %  10;
                System.out.print(lastdigit );
                n /= 10;
            }
            System.out.println();
        }
    }




