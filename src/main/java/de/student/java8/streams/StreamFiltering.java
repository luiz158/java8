package de.student.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author thtesche
 */
class StreamFiltering {

   public static void main(String[] args) {

      List<Dish> menu = Dish.MENU;
      List<Dish> vegetarianDishes = menu.stream()
              .filter((dish) -> dish.isVegetarian())
              .collect(Collectors.toList());
      vegetarianDishes.stream().forEach(System.out::println);
   }
}
