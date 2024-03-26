public class Main
{
	public static void main(String[] args) {
	    String str="madam";//mam,wow,level
	    String newstr="";
	    for (int i=str.length()-1;i>=0 ;i-- ){
	        newstr=newstr+str.charAt(i);
	    }
	    if(str.equals(newstr)){
	        System.out.print("String is palindrome");
	    }
	    else{
	        System.out.print("String is not palindrome");
	    }
	}
}
