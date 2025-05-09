using System;
class HelloWorld {
  static void Main() {
      int[] arr={7,5,6,8,9,10,10};
      int largest=int.MinValue;
      int Slargest=int.MinValue;
      for(int i=0;i<arr.Length;i++){
          if(arr[i]>largest){
              Slargest=largest;
              largest=arr[i];
          }
          else if(arr[i]>Slargest && arr[i]!=largest){
              Slargest=arr[i];
          }
      }
      Console.Write("the slaregst number is "+Slargest);
  }
}

// o/p:the slaregst number is 9
