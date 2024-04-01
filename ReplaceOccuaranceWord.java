public class Main
{
	public static void main(String[] args) {
	    String str="hello hey hy yh";
	    char oldchar='h';
	    char newchar='w';
	    String newstr="";
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)!=oldchar){
	           newstr=newstr+str.charAt(i); 
	        }
	        else{
	            newstr=newstr+newchar;
	        }
	    }
	    System.out.print(newstr);
	  
	   
	}
}
\\_________OUTPUT_______
  wello wey wy yw
