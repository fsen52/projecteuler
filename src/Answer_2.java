
public class Answer_2 {

	public static void main(String[] args) {
		
		int toplam = 2;
		
		int a = 1;
		
		int	b = 2;
				
		while (a<4000000 || b<4000000) {
			
			a = a+b;

			b = a+b;
			
			if (a%2==0) {toplam +=a;
			}
			if (b%2==0) {toplam +=b;
			}
		}
	System.out.println(toplam);
	}
}
