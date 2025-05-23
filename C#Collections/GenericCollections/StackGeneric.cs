// LIFO (last-in, first-out) collection.

using System.Collections.Generic;
using System;
class HelloWorld {
  static void Main() {
    Stack<string> name=new Stack <string>();
    name.Push("mahesh");
    name.Push("jay");
    name.Push("dinesh");
    foreach(var item in name){
        Console.WriteLine(item);
    }
  }
}
