using System.Collections;
using System;
class HelloWorld {
  static void Main() {
      Stack student=new Stack();
      student.Push("hritik");
      student.Push("rohit");
      student.Push("raj");
      foreach(var item in student){
          Console.WriteLine(item);
      }
  }
}

// Output
raj
rohit
hritik
