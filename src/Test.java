import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String greeting = "Hello";
        int cpCount = greeting.codePointCount(0,greeting.length());
        System.out.println(cpCount);
    }
}
