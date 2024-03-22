public class Main
{
	public static void main(String[] args) {
	    int a=10;
	    int b=20;
	    a=a^b;
	    b=a^b;
	    a=a^b;
	    System.out.println("After a value is: "+a);
	    System.out.println("After b value is: "+b);
	}
}
