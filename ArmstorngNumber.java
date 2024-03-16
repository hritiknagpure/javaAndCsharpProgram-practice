public class Main
{
  //Armstrong number is a number that is equal to the sum of cubes of its digits. 
	public static void main(String[] args) {
	    int num=370;         //153=>1+125+27  // 370=>27+343+0
	    int temp=num;
	    int sum=0,rem;
	    while(num<0){
	        rem=num%10;
	        sum=rem*rem*rem+sum;
	        num=num/10;
	    }
	    if(temp==num){
	        System.out.print("yes armstrongNUM");
	    }
	    else{
	        System.out.print("Not a armstrongNUM");
	    }
	}
}
