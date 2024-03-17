public class Main
{
  public static void main(String args[]){
    String str="hello world java";
    String newstr="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=' '){
            newstr+=str.charAt(i);
        }
    }
        System.out.print(newstr);
    }
    
   
}
