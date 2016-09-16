/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class LampdaPredicateTest {

   public LampdaPredicateTest() {
   }

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

      List<String> result = LampdaPredicate.filter(toBeTested, (String s) -> !s.isEmpty());

      assertTrue(result.containsAll(expResult));

   }

}
