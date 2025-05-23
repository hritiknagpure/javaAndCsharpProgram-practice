Queue follows FIFO (First In, First Out).
Non-generic → stores object → type casting required if you need specific types.
Use .Enqueue() to add items, .Dequeue() to remove, and .Peek() to see the front without removing.
For type-safe, modern code, use Queue<T> (generic).

//Code  
using System.Collections;
using System;
class HelloWorld {
  static void Main() {
      Queue student=new Queue();
      student.Enqueue("hritik");
      student.Enqueue("rohit");
      student.Enqueue("raj");
      foreach(var item in student){
          Console.WriteLine(item);
      }
  }
}

Output: 
hritik
rohit
raj
