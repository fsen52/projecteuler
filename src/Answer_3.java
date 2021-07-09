
public class Answer_3 {

	public static void main(String[] args) {

		double sayi = 600851475143.0;
		
		while (sayi>1) {
			
			for (int i = 1; i <=sayi;  i++) {
				//System.out.println("i degeri : "+i);
				double sayac = 0;
				
				for (int j = 1; j < i ; j++ ) {
					//System.out.println("j degeri : "+j);
					if (i % j == 0 ) {
						//System.out.println("uygun j :"+j);
						sayac += 1;
					
					}
				}
		 	if (sayi%i==0 && sayac ==1) {sayi /=i;
		 	System.out.println("sayi : "+sayi);
		 	System.out.println("son bölen i : "+i);
		 	}
		}
		
		
	}

}
}
