package de.student.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author thtesche
 */
public class LambdaPredicateTest {

   /**
    * Test of filter method, of class LampdaPredicate.
    */
   @Test
   public void testFilter() {
      System.out.println("filter");
      List<String> toBeTested = Arrays.asList("a", "", "b", " ");

      List<String> expResult = new ArrayList<>();
      expResult.add("a");
      expResult.add("b");
      expResult.add(" ");

      List<String> result = LambdaPredicate.filter(toBeTested, (String s) -> !s.isEmpty());

      assertTrue(result.containsAll(expResult));

   }

}
