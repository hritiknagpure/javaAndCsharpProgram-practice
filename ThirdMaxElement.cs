using System;
class HelloWorld {
  static void Main() {
     int[] arr={10,30,20,40,50,60,80};
     int flargest=int.MinValue;
     int Slargest=int.MinValue;
     int tlargest=int.MinValue;
     for(int i=0;i<arr.Length;i++){
        if(arr[i]>flargest){
           tlargest=Slargest;
           Slargest=flargest;
           flargest=arr[i];
        }
        else if(arr[i]>Slargest){
           tlargest=Slargest;
           Slargest=arr[i];
        }
        else if(arr[i]>tlargest){
           tlargest=arr[i];
        }
     }
     Console.Write("Slargest element is "+tlargest);
  }
}

// op: Thirdlargest element is 50
