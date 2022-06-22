package volume01.chapter05.objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args) throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 0; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
