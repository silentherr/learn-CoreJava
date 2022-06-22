package volume01.chapter05.methods;

import java.lang.reflect.Method;

/**
 * This program shows how to invoke methods through reflection.
 */
public class MethodTableTest {

    public static void main(String[] args) throws ReflectiveOperationException {
        // get method pointers to the square an sqrt methods
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        // print tables of x- and y-values
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * Returns the square of a number
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * Print a table with x- and y-values for a method
     */
    public static void printTable(double from, double to, int n, Method method) throws ReflectiveOperationException {
        System.out.println(method); // print out the method as table header

        double dx = (to - from ) / (n - 1);
        for (double x = from; x <= to; x += dx) {
            double y = (Double) method.invoke(null, x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
    }
}
