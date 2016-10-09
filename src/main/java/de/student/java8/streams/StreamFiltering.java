package de.student.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author thtesche
 */
class StreamFiltering {

   public static void main(String[] args) {

      List<Dish> menus = Dish.MENU;
      List<Dish> vegetarianDishes = menus.stream()
              .filter((menu) -> menu.isVegetarian())
              .collect(Collectors.toList());
      vegetarianDishes.stream().forEach(System.out::println);
   }
}
