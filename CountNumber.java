public class Main
{
	public static void main(String[] args) {
	    int num=1234565678;
	    int count=0;
	    while(num>0){
	        num=num/10;
	        count++;
	    }
	    System.out.print("Total Numberis :"+count);

	}
}
__OUTPUT__
  Total Numberis :10
