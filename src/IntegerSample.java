import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class IntegerSample {

    public static void main(String[] args) {
        int age = 25;
        age = 20; // 20
        age = age + 5; // 25
        age += 5; // 30
        age += 1; // 31
        age++; // 32 (postfix increment)
        ++age; // 33 (prefix increment)
        System.out.println("age = " + age);

        int x = 10;
        x += x++ + ++x;
        System.out.println("x = " + x);
    }
}
