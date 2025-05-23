Stack follows LIFO (Last In, First Out).

Use .Push() to add, .Pop() to remove, and .Peek() to view the top.

It's non-generic, so items are stored as object.

Use casting when retrieving specific types (not type-safe).
Stack implement: ICollection,IEnumerable

ICloneable
  //code
using System.Collections.Generic;
using System;
class HelloWorld {
  static void Main() {
      Stack<string> student=new Stack<string>();
      student.Push("hritik");
      student.Push("rohit");
      student.Push("raj");
      foreach(var item in student){
          Console.WriteLine(item);
      }
  }
}
// output
raj
rohit
hritik
