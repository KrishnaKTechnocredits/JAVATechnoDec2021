package nishika;

public class A7_assignment7 {
	void evenChar(String name){
		for(int index=0; index<name.length(); index++)
			if(index%2!=0)
			System.out.println(name.charAt(index));
	}

	void displayVowels(String name){
		for(int index=0; index<name.length(); index++){
			if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o' ||name.charAt(index)=='u')
			System.out.println(name.charAt(index));	
		}
	}

	public static void main(String[] args){
		A7_assignment7 a7_assignment7 = new A7_assignment7();	
		a7_assignment7.evenChar("technocredits");
		System.out.println("-----");
		a7_assignment7.displayVowels("technocredits");
		}
}
