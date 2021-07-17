
public class Example {
    public static void main(String[] args){
        long sumIndividualSquared = 0;
        long sumWholeSquared = 0;

        for(int i = 1 ; i <= 100; i++){
            sumIndividualSquared += i*i;
        }

        for( int i = 1 ; i <=100; i++ ){
            sumWholeSquared += i;
        }
        System.out.println("The diference is :" + ((sumWholeSquared
                * sumWholeSquared) - sumIndividualSquared));

    }

}
		

