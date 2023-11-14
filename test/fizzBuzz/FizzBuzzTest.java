package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz f;
	@BeforeEach
	void setUp(){
		f = new FizzBuzz();
	}

	@Test
	void test_Not_Fizz_Buzz() {
		assertEquals("1", f.fizzBuzz(1));
		assertEquals("2", f.fizzBuzz(2));
		assertEquals("4", f.fizzBuzz(4));
	}
	
	@Test
	void test_Fizz() {
		assertEquals("fizz", f.fizzBuzz(3));
	}

}
