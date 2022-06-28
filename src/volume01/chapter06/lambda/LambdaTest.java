package volume01.chapter06.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;

/**u
 * This program demonstrates the use of lambda expressions.
 */
public class LambdaTest {

    public static void main(String[] args) {
        var planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in a dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
