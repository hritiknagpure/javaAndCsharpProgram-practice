public class Main
{
	public static void main(String[] args) {
	   String str="hello ji namaskar";
	   int count=1;
	   for(int i=0;i<str.length()-1;i++){
	       if(str.charAt(i)==' '&&str.charAt(i+1)!=' '){
	           count++;
	       }
	   }
	   System.out.print("Total word is"+count);
	   }  
	   
	}
//_____OUTPUT_____
total word is: 3
