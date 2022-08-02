package java_basic_programs;

public class Assignment4 {

	public static void main(String[] args) {
		// sum of first 100 natural numbers
		int i;
		int sum = 0;
		
		for( i = 1; i <= 100; i++) {        //for(initialize variable; condition; change;)
			sum += i;
		}
			System.out.println(sum);
			
		// sum of first multiples o multiples of 5
		int mul = 0;
		
		for( int x = 1; x <= 100; x++) {
			mul += 5*x;
			
		}
			System.out.println(mul);
			
		// print from 1000 to 100 but in differences of 10 in horizontal line
		
		for (int y = 1000; y >= 100; y -= 10) {
			
			System.out.print(y  + " ");
		
		}
			
	}


}
