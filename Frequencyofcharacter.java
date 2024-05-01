public class OccuarnceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello how are you";
		int count=0;
		for(int i=0;i<str.length();i++) {
			count=0;
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++) {
				char c=str.charAt(j);
				if(i>j&&ch==c) {
					break;
				}
				if(ch==c) {
					count++;
				}
			}
			if(count!=0&&str.charAt(i)!=' ') {	
			System.out.println(ch+"->"+count);
		}
		
		}
	}

}
// OUTPUT
h->2
e->2
l->2
o->3
w->1
a->1
r->1
y->1
u->1
