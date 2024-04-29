package Practise;

public class Inerchangeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hello java
//		java hello
		String str="hello java";
		String result="";
		char ch;
		str=str+" ";
		String word="";
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}
			else {
				result=word+" "+result;
				word=" ";
			}
		}
		System.out.println(result);

	}

}
