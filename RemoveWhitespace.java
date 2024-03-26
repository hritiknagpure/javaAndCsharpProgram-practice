public class Main
{
	public static void main(String[] args) {
	    String str="Hello world";
	    String newstr="";
	    for (int i=0; i<=str.length()-1;i++ ) {
	        if (str.charAt(i)!=' ') {
	            newstr=newstr+str.charAt(i);
	        }
	        
	    }
	    System.out.print("after remove white space: "+newstr);
}
}

//_______OUTPUT
after remove white space: Helloworld
