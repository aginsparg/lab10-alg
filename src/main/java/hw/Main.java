package hw;


import java.util.List;

public class Main {

  public static void main(final String[] args) {
    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.err.println("The argument entered must be an integer ");}
List <String> numbers = fizzBuzz.fizzBuzzList(max);
     for (int i=0; i<numbers.size(); i++)
        System.out.println(numbers.get(i));

      }
    }
  }
