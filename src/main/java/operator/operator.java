package operator;

import java.nio.file.OpenOption;

import static cn.hutool.core.util.NumberUtil.range;

public class operator {

    int i;

    operator(){}

      operator(int a){
          this();

        System.out.println(1111);

      }





//    void test(long i){
//      this();
//    }

    public static void main(String[] args) {
        short i = 0;

        operator op = new operator();

    }


    @Override
    protected void finalize() throws Throwable {
    }
}


