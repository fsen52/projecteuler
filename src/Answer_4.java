
public class Answer_4 {

	public static void main(String[] args) {

		int sonuc = 0;
		
		
		int ksonuc = 0;
		
		for (int i=100;i<999; i++) {
			
			for(int j=100;j<999;j++) {
				
				sonuc = i*j;

				String x = Integer.toString(sonuc);
				
				StringBuffer y = new StringBuffer(x);
				
				y=y.reverse();
				
				
				if(x.substring(0,3).equals(y.substring(0, 3)) && sonuc>ksonuc) {
					
					ksonuc = sonuc;
					
					System.out.println(sonuc);
					
				
				}
				
				
			}
		}
		
	}

}
