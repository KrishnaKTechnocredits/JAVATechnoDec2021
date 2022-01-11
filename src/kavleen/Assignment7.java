package kavleen;

public class Assignment7 {
	
	void evenPosition(String name) {
	  for(int index=0;index<name.length();index++) {
		  if(index%2==0)
			  System.out.println(name.charAt(index));
	  }
	}
	
	void onlyVowels(String name) {
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)=='a' || name.charAt(index)=='i' || name.charAt(index)=='e' || name.charAt(index)=='o' || name.charAt(index)=='u')
		     System.out.println(name.charAt(index));
		}
	}
	public static void main (String[] args) {
		Assignment7 assignment7 = new Assignment7();
		System.out.println("The above are the characters at even position:");
		assignment7.evenPosition("Technocredits");
		System.out.println("The vowels found below are :");
		assignment7.onlyVowels("Technoccredits");
		
	}

}
