Equivalent with Queue<string> (Generic)

using System.Collections.Generic;
using System;
class HelloWorld {
  static void Main() {
      Queue<string> student=new Queue<string>();
      student.Enqueue("hritik");
      student.Enqueue("rohit");
      student.Enqueue("raj");
      foreach(var item in student){
          Console.WriteLine(item);
      }
  }
}
