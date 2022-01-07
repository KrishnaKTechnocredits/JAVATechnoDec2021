package tanu;

class Assignment16 {

	void totalVowelCount(String[] name ) {
		String element;
		int finalcount = 0;
		for (int index = 0; index < name.length; index++) {
			int vowelcount = 0;
			element = name[index];
			for(int alpha=0; alpha<element.length(); alpha++)
			{
				if (element.charAt(alpha)=='a'||element.charAt(alpha)=='e'|| element.charAt(alpha)=='i'|| element.charAt(alpha)=='o'|| element.charAt(alpha)=='u') {
					vowelcount++;
					
				}
			}
			System.out.println(element);
			System.out.println(vowelcount);
			finalcount = finalcount + vowelcount;
		}
		System.out.println("Total Vowels" + finalcount);
	}

	public static void main(String[] arg) {
		Assignment16 assignment16 = new Assignment16();
		String[] userinput = { "karan", "shweta", "pallavi", "abhishek", "sagar" };
		assignment16.totalVowelCount(userinput);

	}

}