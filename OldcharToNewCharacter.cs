using System;
class HelloWorld {
  static void Main() {
      string str="ajit";
      char oldchar='j';
      char newchar='m';
      string newstr="";
      for(int i=0;i<str.Length;i++){
          if(str[i]!=oldchar){
              newstr=newstr+str[i];
          }
          else{
              newstr=newstr+newchar;
          }
      }
      Console.WriteLine(newstr);
  }
}

op:amit
