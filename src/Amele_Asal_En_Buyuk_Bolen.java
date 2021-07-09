
public class Amele_Asal_En_Buyuk_Bolen {

	public static void main(String[] args) {
		
		
		double sayi = 600851475143.0;
		
		double bolen = 0;
		
		
		for (int i = 1; i < Math.pow(sayi,0.5);  i++) {
			System.out.println("i degeri : "+i);
			double sayac = 0;
			
			for (int j = 1; j < i ; j++ ) {
				//System.out.println("j degeri : "+j);
				if (i % j == 0 ) {
					//System.out.println("uygun j :"+j);
					sayac += 1;
				
				}
			}
	 	if (sayi%i==0 && sayac ==1) {bolen = i;
	 	
	 	}
		
		}
		System.out.println(bolen);
	}

}
