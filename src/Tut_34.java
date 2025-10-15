public class Tut_34 {
    public static int binCoefficient(int n,int r){
        int fact_n = Tut_33.factorial(n);
        int fact_r= Tut_33.factorial(r);
        int fact_nmr= Tut_33.factorial(n-r);
        int binomial_fact = fact_n/(fact_r*fact_nmr);
        return binomial_fact;
    }

    public static int binCoefficient(int a1,int b1,int c1) {
        return a1+b1+c1;
    }
    public static float binCoefficient(float a2,float b2,float c2) {
        return a2+b2+c2;
    }
// function overloading:Function having same name but different parameters
    public static void main(String[] args) {

        System.out.println(binCoefficient(30,6));
        System.out.println(binCoefficient(5,4,9));
        System.out.println(binCoefficient(5.3f,4.7f,9.4f));

    }


}
