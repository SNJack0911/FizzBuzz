package fizzBuzz;

public class FizzBuzz {

	public String fizzBuzz(int i) {
		if ((i%3==0)&&(i%5==0)) {
			return "fizzbuzz";
		}else if(i%3==0){
			return "fizz";
		}else if(i%5==0) {
			return "buzz";
		}
		return String.valueOf(i);
	}

}
