package Practise;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			for(int k=1;k<=3-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=2;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=2;j>=i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
//OUTPUT_____
   *
  * *
 * * *
  * *
   *

