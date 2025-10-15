
import java.util.*;
public class Tut_52 {
    static void main() {
            int marks[] = new int[3];
            Scanner scanner = new Scanner(System.in);
            marks[0] = scanner.nextInt();
            marks[1] = scanner.nextInt();
            marks[2] = scanner.nextInt();

             System.out.println("Phy" +marks[0]);
        System.out.println("chemistry"+marks[1]);
        System.out.println("maths"+marks[2]);
        System.out.println("Length of array is "+marks.length);
    }
}
