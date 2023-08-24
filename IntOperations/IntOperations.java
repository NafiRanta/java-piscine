public class IntOperations {
    public static int addTwoIntegers(int a, int b) {
        return a+b;
    }
    public static int subtractTwoIntegers(int a, int b) {
        // your code here
        return a-b;
    }
    public static int multiplyTwoIntegers(int a, int b) {
        // your code here
        return a * b;
    }
    public static int divideTwoIntegers(int a, int b) {
        if (b == 0) {
            System.out.println("Warning: Division by zero is ignored.");
            return Integer.MAX_VALUE;
        }

        int sign = (a < 0) ^ (b < 0) ? -1 : 1;
        a = Math.abs(a); // returns absolute value, if -5, will return 5
        b = Math.abs(b);

        int quotient = 0;
        while (a >= b) {
            a -= b;
            quotient++;
        }

        return sign * quotient;
    }
}