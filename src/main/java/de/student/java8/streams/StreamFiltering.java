package de.student.java8.streams;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author thtesche
 */
class StreamFiltering {

   public static void main(String[] args) {

      Dish.MENU.stream()
              .filter((dish) -> dish.isVegetarian())
              .collect(toList())
              .stream()
              .forEach(System.out::println);;

      Dish.MENU.stream()
              .filter((dish) -> dish.isVegetarian())
              .skip(2)
              .map(Dish::getName)
              .collect(toList())
              .stream()
              .forEach(System.out::println);

      Arrays.asList(1, 2, 3, 4, 5).stream()
              .map(i -> (int) Math.pow(i, 2))
              .collect(toList())
              .stream()
              .forEach(System.out::println);

      List<Integer> bucket1 = Arrays.asList(1, 2, 3);
      List<Integer> bucket2 = Arrays.asList(3, 4);

      List<int[]> collect = bucket1.stream()
              .flatMap(i -> bucket2.stream().map(j -> new int[]{i, j}))
              .collect(toList());

      collect
              .stream()
              .forEach(result -> System.out.println(Arrays.toString(result)));

      // Sum of pair is divisible by 3
      System.out.println("");

      collect
              .stream()
              .filter((int[] a) -> (a[0] + a[1]) % 3 == 0)
              .forEach(result -> System.out.println(Arrays.toString(result)));

   }
}
