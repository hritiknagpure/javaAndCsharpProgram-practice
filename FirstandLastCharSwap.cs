using System;
class HelloWorld {
  static void Main() {
     
     string str="james gosling";
     char Fchar=str[0];
     char lchar=str[str.Length-1];
     char[] mid=new char[str.Length-2];
     string newstr="";
     int j=0;
     for(int i=1;i<str.Length-1;i++){
        mid[j]=str[i];
        j++;
     }
     string midchar=new string(mid);
     newstr=lchar+midchar+Fchar;
		Console.Write(newstr);
  }
}
