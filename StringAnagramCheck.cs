using System;
class HelloWorld {
  static void Main() {
      string str1="silent";
      string str2="lisent";
      char[] ch=str1.ToLower().ToCharArray();
      char[] c=str2.ToLower().ToCharArray();
      Array.Sort(ch);
      Array.Sort(c);
      string val1=new string(ch);
      string val2=new string(c);
      if(val1==val2){
          Console.Write("anagram");
      }
      else{
          Console.Write("not a anagram");
      }
      
  }
}
