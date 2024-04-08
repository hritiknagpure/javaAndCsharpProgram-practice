public class ReverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java language is";
		String result=" ";
		String word=" ";
		char ch;
		str=str+" ";
		int len=str.length();
		System.out.println(len);
		for(int i=0;i<len;i++) {
			ch=str.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}
			else {
				result=word+""+result;
				word=" ";
			}
		}
		System.out.println(result);
	}
}
____OUTPUT___
  is language Java  
