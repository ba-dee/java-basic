package Function;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
    static void test(Consumer<String> consumer, Predicate<String> condition,String testV){

        if(condition.test(testV)){
            consumer.accept(testV);
        }

    }

    static boolean  isTure(String str){
        return str.equals("apple");
    }
    public static void main(String[] args) {
        test(t->System.out.println(t),ConsumerTest::isTure,"刘果宁");
        test(t->System.out.println(t),ConsumerTest::isTure,"apple");
        test(t->System.out.println(t),t->t=="apple","apple");
    }
}
