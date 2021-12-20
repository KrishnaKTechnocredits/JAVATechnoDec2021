package saurav;

public class A7_CharAtEvenAndFindVowels {
	
	void charAtEven(String name){
		for(int index=0; index<name.length(); index++)
			if(index%2==0)
				System.out.println(name.charAt(index));
	}
	
	void findVowels(String name) {
		for(int index=0; index<name.length(); index++)
			if(name.charAt(index)=='a'||name.charAt(index)=='e'||name.charAt(index)=='i'||name.charAt(index)=='o'||name.charAt(index)=='u')
				System.out.println(name.charAt(index));
	}
	
	public static void main(String[] a) {
		A7_CharAtEvenAndFindVowels evenvowels= new A7_CharAtEvenAndFindVowels();
		evenvowels.charAtEven("Technocredits");
		System.out.println();
		evenvowels.findVowels("technocredits");
	}
}
