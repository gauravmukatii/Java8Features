package Java8Features;

public class Main {
    public static void main(String... args){

         ThreadClass threadClass = new ThreadClass();
         Thread thread = new Thread(threadClass);
         thread.run();

         MyInterface myInterface = () -> "Ssay Bye";
         System.out.println(myInterface.sayBye());

         MyInterface myInterface1 = () -> "say Bye Again";
         System.out.println(myInterface1.sayBye());


    }
}
