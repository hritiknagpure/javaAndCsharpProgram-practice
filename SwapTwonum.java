//without using third varaible

public class Main
{
	public static void main(String[] args) {
	    int a=10;
	    int b=20;
	    a=a+b; //30
	    b=a-b;//30-20=10
	    a=b+b;
	    System.out.println("After a value is: "+a);
	    System.out.println("After b value is: "+b);
	}
}
//OUTPUT
After a value is: 20
After b value is: 10
