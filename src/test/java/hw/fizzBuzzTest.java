package hw;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class fizzBuzzTest {

    @Test
    public void fizzBuzzArrayNegTen() {
        List<String>test2 = new ArrayList<String>(Arrays.asList());
    }


    @Test
    public void fizzBuzzArrayNegOne() {
        List<String>test2 = new ArrayList<String>(Arrays.asList());;
    }

    @Test
    public void fizzBuzzArrayZero()
    {
        List<String> test= fizzBuzz.fizzBuzzList(0);
        List<String>test2 = new ArrayList<String>(Arrays.asList());
        assertEquals(test2,test);
    }

    @Test
    public void fizzBuzzArrayOne()
    {
       List<String>test= fizzBuzz.fizzBuzzList(1);
        List<String>test2 = new ArrayList<String>(Arrays.asList("1"));
        assertEquals(test2,test);
    }

    @Test
    public void fizzBuzzArraySeven()
    {
        List<String>test= fizzBuzz.fizzBuzzList(7);
        List<String>test2 = new ArrayList<String>(Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7"));
        assertEquals(test2,test);
    }

    @Test
    public void fizzBuzzArraySeventeen()
    {

        List<String>test= fizzBuzz.fizzBuzzList(17);
        List<String>test2 = new ArrayList<String>(Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14","fizz buzz", "16", "17"));

        assertEquals(test2,test);
    }
}