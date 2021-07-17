
public class Answer_7 {

	public static void main(String[] args) {

		int sayac = 0;
		
		int sayi = 1;

		int count = 0;
		while(sayac<=10000) {
	
			sayi+=2;
			
			count = 0;
			
			for (int j=1;j<Math.pow(sayi,0.5)+1;j++) {
				
				
				
				if(sayi%j==0) {
					
					count++;
				}
			
			
			
			
			}
			
				if (count==1) {
				
				sayac++;
				System.out.println(sayi+"---"+sayac);
			}
				
			if(sayac==10000) {System.out.println(sayi);	
			}		
	}

}
}
