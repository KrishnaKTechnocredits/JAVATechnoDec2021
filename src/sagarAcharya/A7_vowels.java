package sagarAcharya;

public class A7_vowels {
	
	void evenPosition(String fullName) {
		System.out.println("Even position characters :");
			for(int index  = 0; index<fullName.length(); index++)
				if(index % 2 !=0) {
					System.out.println(fullName.charAt(index));
				}
	}
	
	void vowels(String name) {
		System.out.println("Vowels :");
			for(int index  = 0; index<name.length(); index++)
				if(name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i' || name.charAt(index)=='o' || name.charAt(index) == 'u') {
					System.out.println(name.charAt(index));
				}
	}

	public static void main(String[] args) {
		A7_vowels a7_vowels = new A7_vowels();
		a7_vowels.evenPosition("SagarAcharya");
		a7_vowels.vowels("Technocredits");
	} 

}
