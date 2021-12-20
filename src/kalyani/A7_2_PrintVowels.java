package kalyani;

public class A7_2_PrintVowels {
	
	void findVowels(String str) {
	System.out.println("Vowels in the given String are:");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') 
			{
			System.out.print(" " + str.charAt(i));
			}
		}
	}

	public static void main(String args[]) {
		
		A7_2_PrintVowels printvowels = new A7_2_PrintVowels();
		printvowels.findVowels("technocredits");
	}
}
