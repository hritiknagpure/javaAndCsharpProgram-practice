public class LinearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"apple","mango","banana","orange"};
		String search="banana";
		int temp=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(search)) {
				System.out.println("string is present at this index"+i);
				temp=temp+1;
			}
			
		}
		if(temp==0) {
			System.out.println("item is not preseent");
		}

	}

}
