
public class Answer_10 {

	public static void main(String[] args) {

		long total = 0;
		
		for (long x = 3 ; x <= 2000000 ; x+=2 ) {

		long count = 0;

		for (long i = 1; i <= Math.sqrt(x); i++) {

			if (x % i == 0) {

				count++;

			}

		}

		if (count < 2) {

			total += x ;
			
			//System.out.println("x değeri : " + x);
			
			
			
		}
	
		
		}
		//I will add "2" to result.
		
		System.out.println("total : " + total);
		
		}
		

}
