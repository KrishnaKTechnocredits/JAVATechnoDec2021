package jayashri;

class A7_EvenNumVowels{
	
	void charAtevenPosition(String name){
		System.out.print("characters at even position:");
		for(int i = 0;i<name.length();i++){
			if(i % 2 == 1)
			System.out.print(name.charAt(i));
		}
	}
	
	void vowelsInString(String name){
		System.out.println("Vowels in " +name+ " are:");
		for(int i = 0;i<name.length();i++){
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
			System.out.print(name.charAt(i));
		}
	}
	
	public static void main(String[]args){
		A7_EvenNumVowels a7_evenNumvowels = new A7_EvenNumVowels();
		a7_evenNumvowels.charAtevenPosition("technocredits");
		a7_evenNumvowels.vowelsInString("technocredits");
	}
}