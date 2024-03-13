package Java8Features;

@FunctionalInterface
public interface MyInterface {

    //single abstract method
    public String sayBye();

    //can have multiple default and static methods
    public default void sayOk(){

    };

    public static void sayHi(){

    };
}
