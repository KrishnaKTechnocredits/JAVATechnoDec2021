package sham;

public class Test1_NonRepeatingCharacter {
	
	void displayNonRepeatingChar(String input,char ch)
	{ 
		
		int count=0;
		for(int index=0;index<input.length();index++)
		{
			if(input.charAt(index)==ch)
			{
				count++;
				
			}
		}
		if(count==1) {
			System.out.println("first non repeating char is: "+ch);
		}
		else 
			System.out.println("we found multiple occurances for provided char: "+ch);
		 
	}

	public static void main(String[] args) {
		Test1_NonRepeatingCharacter nonRepeating= new Test1_NonRepeatingCharacter();
		nonRepeating.displayNonRepeatingChar("technocredits", 'h');
		nonRepeating.displayNonRepeatingChar("technocredits", 'e');
	}

}
