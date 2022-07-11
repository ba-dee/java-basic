package templete.test;

import java.util.List;

public class PECSTest {

    /**PECS  Producer extends Consumer super
    生产者提供数据get, 消费车set数据 （占站泛型本身角度）**/

    /**具体就是左边的<>限制右边的<>,而右边的<>决定最终存储的类型
    编译看左：<? extends Furit>
         *  假设set()可以使用，编译器只能识别set(形参)中是否为“new了一个Furit及其子类的形参”
            *  运行看右：<Apple>
         *  而右边部分new plate<Apple>(new Apple())一开始就确定了p10只能放Apple
         *  倘若可以使用set(new Banana())，由于Banana也是Furit子类，编译器无法判断错误，但运行则会出错
         *  因此编译器直接取消了上边界extends中的set方法 **/

    static class plate<T>{
        private T t;
        public plate(T t){
            this.t = t;
        }
        public  void set(T t){
            this.t = t;
        }
        public T get(){
            return t;
        }
        void syayHello(List<? extends String> a){

        }
    }

    static class Food{}//食物
    static class Fruit extends Food{}
    static class Apple extends Fruit{}
    static class Banana extends Fruit{}


    public static void main(String[] args) {
        plate<? extends Fruit> p10 = new plate<Apple>(new Apple());
        plate<? extends Food> p11 = new plate<Banana>(new Banana());
        //p10 = p11; //看左边 不可以
        p11 = p10; //看左边
        //p10.set(new Apple()); //不能设置   左编译，右边运行
        Fruit f = p10.get(); //可以获取 可定是一个Fruit


        //plate<? super Fruit> p12 = new plate<Apple>(new Apple()); 不允许
        plate<? super Fruit> p13 = new plate<Fruit>(new Banana());
        plate<? super Fruit> p14 = new plate<Food>(new Food());
        plate<? super Banana> p15 = new plate<Food>(new Food());

        //p13= p15; 看左边 不可以
        p15= p13;

        p13.set(new Apple());
        //p13.set(new Food()); //不可以 ，客设置 Fruit子类

    }

}
