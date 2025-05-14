using System;

class Program
{
    static void Main()
    {
        string input = "101101111011";
        int count = 0;
        char key = '1';

        for (int i = 0; i < input.Length - 1; i++)
        {
            // Check if current character and next character are both '1'
            if (input[i] == key && input[i + 1] == key)
            {
                count++;
            }
        }

        Console.WriteLine("Count of '11': " + count);
    }
}
// Output
// Count of '11': 5
