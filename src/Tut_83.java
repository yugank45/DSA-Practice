public class Tut_83 {
    static void main(String[] args) {
        // Swapping two variables without usng third variable in bit manipulation
    int a = 10;
    int b = 30;
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("Adding any number by 1 using bit operation");

        // Adding any number by 1 using bit operation
        int a1 = 30;
        int b1 = -(~a);
        System.out.println(b1);

        // Converting Lower case character to upper case character using bit operation

        char ch = 'A';
        char ans = (char)(ch | 0x20);
        System.out.println(ans);
        //Second method
        char ch1 = 'A';
        char ans1 = (char)(ch | 32);
        System.out.println(ans1);

    }
}


