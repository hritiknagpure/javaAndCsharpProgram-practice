using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        string input = "hritik";
        char key = 'r';
        string result = "";
        for(int i=0;i<=input.Length-1;i++){
            if(input[i]!=key){
                result=result+input[i];
            }
        }

        Console.WriteLine(result);  // Output: hitik
    }
}
