public class InterchangeWords {

	public static void main(String[] args) {
		//james gosling
		//games goslinj
		String str="james gosling";
		int strlen=str.length();
		char fchar=str.charAt(0);
		char lchar=str.charAt(str.length()-1);
		char mid[]=new char[str.length()-2];
		String newstr=" ";
		for(int i=1;i<str.length()-1;i++) {
			mid[i-1]=str.charAt(i);
		}
//		String midstring=new String (mid);
		newstr=lchar+new String(mid)+fchar;
		System.out.println(newstr);
		

	}
}
