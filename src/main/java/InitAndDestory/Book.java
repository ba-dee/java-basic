package InitAndDestory;

import java.util.Arrays;
import java.util.Random;

public class Book {



    static void  test(String ...args){
        for (Object arg : args) {
            System.out.println(arg);
        }
    }
    static void  test(Integer ...args){
        System.out.println("------");
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {

        //test();
    }


}
