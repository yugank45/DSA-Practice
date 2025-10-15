
import java.lang.String;
import java.util.Scanner;

public class Tut_74_Strings {

    static void print_Strings(String name1) {
        for (int i =0;i<name1.length();i++){
            System.out.print(name1.charAt(i) + " ");
        }
        System.out.println();
    }

    static void main() {
        // types to declare strings
        char str1[] = { 'x'};
        System.out.println(str1);
        String str = new String("Yugank Singh");
        System.out.println(str);

        String str11 = "xyz";
        System.out.println(str11);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name:");
        String name;
        name = scanner.nextLine();
        System.out.println(name);

        String name1= "Yugank Singh";
        System.out.println(name1.length());
        print_Strings(str);

        System.out.println(name1.charAt(0));


    }
}
