package de.student.java8.lambdas;

import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;

/**
 *
 * @author thtesche
 */
public class LambdaSorting {

   public static void main(String[] args) {

      List<String> list = Arrays.asList("aaaaaaa", "aa", "aaa", "a");
      list.forEach(System.out::println);

      // Longest strings first
      list.sort((String s1, String s2) -> s2.length() - s1.length());
      list.forEach(System.out::println);

      // Short strings first. Most elegant implementation
      // list.sort(comparing((string) -> string.length()));
      list.sort(comparing(String::length));

      list.forEach(System.out::println);

   }

}
