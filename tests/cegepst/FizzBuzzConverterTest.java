package cegepst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzConverterTest {

    private FizzBuzzConverter converter;

    public FizzBuzzConverterTest() {
        converter = new FizzBuzzConverter();
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", converter.convert(3));
        assertEquals("Fizz", converter.convert(9));
        assertEquals("Fizz", converter.convert(21));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", converter.convert(5));
        assertEquals("Buzz", converter.convert(10));
        assertEquals("Buzz", converter.convert(20));
    }

    @Test
    public void FizzBuzz() {
        assertEquals("Fizz Buzz", converter.convert(15));
        assertEquals("Fizz Buzz", converter.convert(30));
        assertEquals("Fizz Buzz", converter.convert(40));
    }

    @Test
    public void testNormal() {
        assertEquals("1", converter.convert(1));
        assertEquals("1", converter.convert(4));
    }
}