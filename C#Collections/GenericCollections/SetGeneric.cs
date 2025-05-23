//Set  Unordered collection of unique elements.

using System.Collections.Generic;
using System;
class HelloWorld {
  static void Main() {
      HashSet<string> s1=new HashSet<string>();
      s1.Add("my");
      s1.Add("name");
      s1.Add("hritik");
      foreach(var item in s1){
          Console.WriteLine(item);
      }
  }
}

// output
my
name
hritik
