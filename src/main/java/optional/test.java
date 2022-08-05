package optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class test {

    public static void main(String[] args) {
        //构建并使用
        System.out.println(Optional.empty().orElseGet(()->"张三"));
        System.out.println(Optional.ofNullable("apple").orElseGet(()->"张山"));
        //System.out.println(Optional.of(null).orElseGet(()->"李四"));

        //比较两个 Optional
        System.out.println(Optional.ofNullable("apple").equals("apple"));

    }
}
