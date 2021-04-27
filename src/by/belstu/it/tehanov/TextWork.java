package by.belstu.it.tehanov;
import java.util.stream.IntStream;

public class TextWork {
    public TextWork() {

    }

    public int test;

    public void setTest(int test) {
        this.test = test;
    }
    public int getTest() {
        return test;
    }

    public void getText() {
        System.out.println("getValue");
        IntStream.range(0, 10).forEach(System.out::println);
    }

    public void OnCreate() {
        for (int e = 0; e < 20; e++) {
            System.out.println("Count"  + e);
        }
    }
}

