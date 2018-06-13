package hw;

import java.util.*;

public class fizzBuzz {

  public static List<String> fizzBuzzList(int n) {
    List<String> fizzbuzz = new ArrayList<>();
    int b=0;
    for (int i = 1; i <= n; i++) {
      if((i % 3 == 0) && (i % 5 == 0))
        fizzbuzz.add("fizz buzz");
      else if (i % 3 == 0)
        fizzbuzz.add("fizz");
      else if (i % 5 == 0)
        fizzbuzz.add("buzz");
      else
        fizzbuzz.add( Integer.toString(i));
      b++;
    }
    return fizzbuzz;
  }
}