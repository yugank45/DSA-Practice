import java.util.*;

public class Tut_78 {
    // Substring - A continuous part from strings
    // si = starting index, ei = ending index
    static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr; // return final substring
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // Get substring from index 0 to 5 (Hello)
        String result = subString(str, 0, 5);
        result = str.substring(0,4);
        System.out.println("Substring: " + result);
    }
}
