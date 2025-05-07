using System;
class HelloWorld {
  static void Main() {
      string str="hello world";
      string word= "";
      string newstr= "";
      for(int i=0;i<str.Length;i++){
          if(str[i]!=' '){
              word=str[i]+word;
          }
          else{
              newstr=newstr+word+" ";
              word= "";
          }
      }
      newstr=newstr+word+" ";
      Console.Write(newstr);
  }
}

// op: olleh dlrow 
