
public class Main {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++ ) 
		{
			for (int k = 1; k < i; k++ ) 
			{
				System.out.print(" ");
			}
			for(int j = i; j <= 6; j++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for (int i = 6 - 1; i >= 1; i-- ) 
		{
			for (int k = 1; k < i; k++ ) 
			{
				System.out.print(" ");
			}
			for(int j = i; j <= 6; j++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
