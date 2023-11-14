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
	void test_ALl() {
		for (int i=0;i<100;i++) {
			if ((i%3==0)&&(i%5==0)) {
				assertEquals("fizzbuzz",f.fizzBuzz(i));
			}else if (i%3==0) {
				assertEquals("fizz", f.fizzBuzz(i));
			}else if (i%5==0) {
				assertEquals("buzz", f.fizzBuzz(i));
			}else {
				assertEquals(String.valueOf(i),f.fizzBuzz(i));
			}
		}
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
