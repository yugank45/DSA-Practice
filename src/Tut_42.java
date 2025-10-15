public class Tut_42 {
        public static void main(String[] args) {
            double positiveNumber = 7.3;
            double negativeNumber = -5.8;
            double integerNumber = 9.0;

            double ceilPositive = Math.ceil(positiveNumber);
            double ceilNegative = Math.ceil(negativeNumber);
            double ceilInteger = Math.ceil(integerNumber);
            double max = Math.max(-5.7, -6.1);
            System.out.println(max);
            int min = Math.min(4, 6);
            System.out.println(min);
            int abs = Math.abs(-3);
            System.out.println(abs);
            double floor = Math.floor(4.1);
            System.out.println(floor);
            double pow = Math.pow(2, 4);
            System.out.println(pow);
            double random = Math.random();
            System.out.println(random);
            long round = Math.round(3.499);
            System.out.println(round);
            int sqrt = (int)Math.sqrt(4);
            System.out.println(sqrt);
            System.out.println(Math.log(10));
            System.out.println(Math.log10(10));

            System.out.println("Ceil of " + positiveNumber + " is: " + ceilPositive); // Output: Ceil of 7.3 is: 8.0
            System.out.println("Ceil of " + negativeNumber + " is: " + ceilNegative); // Output: Ceil of -5.8 is: -5.0
            System.out.println("Ceil of " + integerNumber + " is: " + ceilInteger);   // Output: Ceil of 9.0 is: 9.0
        }
    }

