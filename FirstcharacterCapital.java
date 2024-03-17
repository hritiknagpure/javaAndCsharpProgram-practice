public class Main
{
  public static void main(String args[]){
    String str="hello world";
    String newstr="";
    char ch;
    for(int i=0;i<str.length();i++){
      ch=str.charAt(i);
      if(i==0||str.charAt(i-1)==' '){
        newstr=newstr+Character.toUpperCase(ch);
      }
      else{
        newstr=newstr+ch;
    }
    }
    System.out.print(newstr);
  }
}
