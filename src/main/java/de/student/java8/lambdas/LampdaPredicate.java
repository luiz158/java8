package de.student.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Example class to demonstrate the usage of lambdas.
 *
 * @author thtesche
 */
public class LampdaPredicate {

   public static void main(String[] args) {
      List<String> toBeTested = Arrays.asList("a", "", "b", "  ", " ");

      List<String> result = LampdaPredicate.filter(toBeTested, (String s) -> !s.trim().isEmpty());

      System.out.println("Not empty elements of the list:");
      result.forEach((String s) -> System.out.format("\"%s\"\n", s));

      result = LampdaPredicate.filter(toBeTested, (String s) -> s.trim().isEmpty());
      System.out.println("Empty elements of the list:");
      result.forEach((String s) -> System.out.format("\"%s\"\n", s));

   }

   public static <T> List<T> filter(List<T> listToFilter, Predicate<T> p) {
      List<T> results = new ArrayList<>();
      listToFilter.stream().filter((string) -> (p.test(string))).forEach((string) -> {
         results.add(string);
      });
      return results;
   }

}
