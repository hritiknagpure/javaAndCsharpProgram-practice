Hashtable stores key-value pairs of type object.
Unordered — no guarantee of insertion order.
Keys must be unique; values can be duplicated.
Consider using Dictionary<TKey, TValue> (generic, type-safe) in modern code.

  // Code
using System.Collections;
using System;
class HelloWorld {
  static void Main() {
      Hashtable student=new Hashtable();
      student.Add(1,"hritik");
      student.Add(2,"rohit");
      student.Add(3,"rohit");
      foreach(DictionaryEntry item in student){
          Console.WriteLine(item.Key+" "+ item.Value);
      }
  }
}  
  Output:
3 rohit
2 rohit
1 hritik
