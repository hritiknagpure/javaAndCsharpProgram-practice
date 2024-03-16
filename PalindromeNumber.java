public class Main
{
	public static void main(String[] args) {
	    int num=2114112; //121,51415,176767671
	    int temp=num;
	    int rev=0,rem;
	    while(num>0){
	        rem=num%10;
	        rev=rev*10+rem;
	        num=num/10;
	    }
	    if(rev==temp){
	        System.out.print("It's a palindrome num");
	    }
	    else{
	        System.out.print("Not a palindrome num");
	    }
	}
}
