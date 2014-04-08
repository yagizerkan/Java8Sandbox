package yagizerkan.sandbox.java8.lambda;

/**
 * @author Yagiz Erkan
 * @since 07/04/2014
 */
public class ValueCaptureAnon {
  public static void main(String[] args) {
    String name = "Yagiz"; //Compile error in Java 7.
                           //local variable name is accessed from within inner class; needs to be declared final

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Name is " + name);
      }
    };

    //name = name + " Erkan"; //Compile error in Java 8.

    runnable.run();
  }
}
