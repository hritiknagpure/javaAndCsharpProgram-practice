Stores key-value pairs.

Automatically sorts keys in ascending order.

Belongs to System.Collections (non-generic) — stores object.

  //code

  using System.Collections;
using System;
class HelloWorld {
  static void Main() {
      SortedList list=new SortedList();
      list.Add(1,"hritk");
      list.Add(3,"rohit");
      list.Add(2,"raj");
      foreach(DictionaryEntry item in list){
          Console.WriteLine(item.Key+" "+item.Value);
      }
  }
}

// output
1 hritk
2 raj
3 rohit
