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
	void testFizzBuzz() {
		assertEquals("1", f.fizzBuzz(1));
	}

}
