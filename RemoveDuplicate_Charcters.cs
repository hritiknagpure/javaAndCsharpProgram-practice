using System;
using System.Collections.Generic;

namespace HelloWorld
{
	public class Program
	{
		public static void Main(string[] args)
		{
			string str="Hellohritik";
			string newstr="";
			HashSet<char> s1 =new HashSet<char>();
			foreach(char c in str){
			  
			  if(!s1.Contains(c)){
			    s1.Add(c);
			    newstr=newstr+c;
			  }
			}
			Console.Write(newstr);
	}
}}

//op: Helohritk
