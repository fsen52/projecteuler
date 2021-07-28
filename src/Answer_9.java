
public class Answer_9 {

	public static void main(String[] args) {

		/*

			A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
			
			a2 + b2 = c2

			For example, 32 + 42 = 9 + 16 = 25 = 52.

			There exists exactly one Pythagorean triplet for which a + b + c = 1000.
			
			Find the product abc.

		 */		
		
		
	
			
			for (int a = 1 ; a<333 ; a++) {
				
				for (int b = a+1; b<500; b++) {
					
					for (int c = b+1; c<1000; c++) {
						
						if(a+b+c==1000 && a*a+b*b==c*c) {
							
							System.out.println(a*b*c);
							
						}
					}
				}
			}
			
		
		
		
	}

}
