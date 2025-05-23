// List<T> is a class in C# that implements the IList<T> interface.
  
using System.Collections;
using System;
class HelloWorld {
  static void Main() {
      ArrayList list=new ArrayList();
      list.Add(1);
      list.Add(2);
      list.Add(3);
      foreach(object item in list){
          Console.Write(item);
      }
  }
}
