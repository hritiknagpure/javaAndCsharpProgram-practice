using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8};
        int key=6;
        int count=0;
        for(int i=0;i<arr.Length;i++){
            if(arr[i]!=key){
                count++;
            }
        }
        int[] newarr=new int[count];
        int j=0;
        for(int i=0;i<arr.Length;i++){
            if(arr[i]!=key){
                newarr[j]=arr[i];
                j++;
            }
        }
        foreach(int item in newarr){
            Console.Write(item);
        }
    }
}

// op: 1,2,3,4,5,7,8
