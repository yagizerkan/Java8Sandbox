package yagizerkan.sandbox.java8.lambda;

/**
 * @author Yagiz Erkan
 * @since 07/04/2014
 */
public class ValueCapture {
  public static void main(String[] args) {
    String name = "Yagiz";

    Runnable runner = () -> System.out.println("Name is: " + name);
    //name = "Erkan"; //Compile error: local variables referenced from a lambda expression
                      // must be final or effectively final
    runner.run();
  }
}