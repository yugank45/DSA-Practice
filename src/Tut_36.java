public class Tut_36 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        // Check divisibility up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print prime numbers up to n
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInRange(20);
    }
}
