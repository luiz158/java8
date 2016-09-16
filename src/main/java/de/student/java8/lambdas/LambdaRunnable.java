package de.student.java8.lambdas;

/**
 *
 * @author thtesche
 */
public class LambdaRunnable {

   public static void main(String[] args) {

      final int meaningOfLife = 42;

      Runnable runnable = () -> {
         System.out.println("What's the meaning of life? " + meaningOfLife);
      };
      runnable.run();

   }
}
