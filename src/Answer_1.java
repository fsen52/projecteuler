

public class Answer_1 {

	public static void main(String[] args) {
		

		int toplam = 0 ;
		
		for (int j = 0; j < 1000; j++) {
			
			if (j % 3 == 0 || j % 5 == 0 ) {toplam +=j;
				
			}
			
		}		
		 System.out.println(toplam);
		
		
	}

}
