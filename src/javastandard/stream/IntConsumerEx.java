package javastandard.stream;
import java.util.function.IntConsumer;

public class IntConsumerEx {
    public static void main(String[] args) {
        IntConsumer consumer = (int value) -> System.out.println(value);
        consumer.accept(5); // 출력: 5
    }

}
