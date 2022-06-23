package templete.test;

public interface ICar {
     void setName(String name);
     void getName();
     default void sayHello(){
         System.out.println("hello...................................");
     }
}
