public class VowelsAndConsonat {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string");
		String str = sc.nextLine();
		int Vcount=0;
		int Ccount=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				Vcount++;

			}
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				Ccount++;
				
			}
		}
		System.out.println("the vowels is"+Vcount);
		System.out.println("the consonat is"+Ccount);

	}

}
