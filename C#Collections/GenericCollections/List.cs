using System.Collections.Generic;
using System;
class HelloWorld {
  static void Main() {
    List<string> name=new List<string>();
    name.Add("mahesh");
    name.Add("jay");
    name.Add("dinesh");
    foreach(var item in name){
        Console.WriteLine(item);
    }
  }
}

output:
mahesh
jay
dinesh
