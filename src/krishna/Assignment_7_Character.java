package krishna;

public class Assignment_7_Character {
	String startString= " "; 
	void evenString(String word){
		for(int index=0; index<word.length(); index++) {
			if((index+1) % 2 == 0) 
				startString = startString + word.charAt(index);
		}			
		System.out.println("The character present at even position :  "  + startString);
	}
	
	void vowels(String word){
		String startString= " ";
		for(int index=0; index<word.length(); index++) {
			if(word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i' || word.charAt(index) == 'o' || word.charAt(index) == 'u') 
				startString = startString + word.charAt(index);
		}			
		System.out.println("The vowels present :  " + startString);
	}
	
	public static void main(String[] arr){
		Assignment_7_Character assignment7_Character = new Assignment_7_Character();
		assignment7_Character.evenString("technocredits");
				assignment7_Character.vowels("technocredits");
		}

}