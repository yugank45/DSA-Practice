
import java.util.*;
public class Tut_31 {
    public static void swap(int a,int b) {
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("a="+b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
    }
}
