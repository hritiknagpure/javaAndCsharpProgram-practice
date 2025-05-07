using System;
class HelloWorld {
  static void Main() {
      string str="hello world";
      string word= "";
      string newstr= "";
      for(int i=0;i<str.Length;i++){
          if(str[i]!=' '){
              word=word+str[i];
          }
          else{
              newstr=word+" "+newstr;
              word= "";
          }
      }
      newstr=word+" "+newstr;
      Console.Write(newstr);
  }
}

// op: world hello 
