public class Tut_77 {
    static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String st4 = new String("Tony");
        String st3 = new String("Tony");
        if (str1 == str2){
            System.out.println("They are equal");
        }
        else System.out.println("Not equal");

        if (st4.equals(st3)){
            System.out.println("They are equal");

        }else System.out.println("Not Equal");
    }




}
