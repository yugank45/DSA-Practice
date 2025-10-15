public class Tut_75 {
// logic string divide into 2 parts and comparing first and last index
    static boolean isPalindrome(String str) {
        for (int i = 0 ;i<str.length()/2;i++){
           int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return  true;
    }

    static void main(String[] args) {
        String str = "racecar";

        System.out.println(isPalindrome(str));;
    }
}
