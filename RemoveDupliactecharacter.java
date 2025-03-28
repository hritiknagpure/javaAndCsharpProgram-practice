public class Main
{
	public static void main(String[] args) {
	    String str="aabcaada";
	    String newstr="";
	    int j;
	    for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        for(j=0;j<str.length();j++){
	            char c=str.charAt(j);
	            if(ch==c){
	                break;
	            }
	        }
	        if(i==j){
	            newstr=newstr+str.charAt(i);
	        }
	    }
	    System.out.print(newstr);
	}
}

// -----------------------------
// output-> abcd
      

