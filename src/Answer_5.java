
public class Answer_5 {

	public static void main(String[] args) {
		
		int carpım = 1;
		
		
		for (int x=2; x<=20; x++) {
			
			int k = x;
			System.out.println("il k değeri : "+ k);
			for (int y=x-1; y>0; y--) {
				System.out.println("y değeri : "+y);
				if (k%y==0) {
					
					k/=y;
					
				System.out.println("son k değeri : "+k);	
				}
				
				
			}
			
			carpım *= k;
			
			System.out.println("ara carpım : " + carpım);
		}

		System.out.println(carpım);
		
			
	
	
	}
}
