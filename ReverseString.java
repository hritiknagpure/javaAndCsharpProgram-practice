public class Solution
{
	public static void main(String[] args) {
	    String str="hello world"; //output=> dlrow olleh
	    String newStr="";
	    for(int i=str.length()-1;i>=0;i--){
	        newStr=newStr+str.charAt(i);
	    }
	    System.out.print("Reverse String is: "+newStr);
	}
}
