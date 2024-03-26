public class Main
{
	public static void main(String[] args) {
	    
	    int num=5;
	    int fac=1;
	    int sum=0;
	    for (int i=1;i<=5 ;i++ ){
	        fac=fac*i;
	        sum=sum+i;
	        System.out.println(i);
	    }
	    System.out.println("sum of factorial is: "+sum);
	    System.out.print("The factorial of 5 is: "+fac);
	}
}
