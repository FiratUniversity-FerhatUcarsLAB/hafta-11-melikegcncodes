public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return x * Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // Test 1:
        System.out.println("multadd(1.0, 2.0, 3.0) = " + multadd(1.0, 2.0, 3.0));

        // Test 2: sin(pi/4) + cos(pi/4) / 2
        double piOver4 = Math.PI / 4;
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + multadd(Math.sin(piOver4), 1, Math.cos(piOver4) / 2));

        // Test 3: log(10) + log(20)
        System.out.println("log(10) + log(20) = " + multadd(Math.log(10), 1, Math.log(20)));

        // expSum test
        System.out.println("expSum(1.0) = " + expSum(1.0));
    }
}
