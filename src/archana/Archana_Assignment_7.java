package archana;

public class Archana_Assignment_7 {

	void evenchar(String input) {
		int count = 1;
		
		 for(int index=0 ; index < input.length();index++) {
			 
			 if(count%2==0)
			 {
				 System.out.println(input.charAt(index) +":"+ count);
				
			 }
			 count ++;
		 }
		 System.out.println("--------------------------------------------------------------------------");
		
	}
	 void vowels (String input)
	 {
        for(int index=0 ; index < input.length();index++) {
			 if(input.charAt(index)=='a'||input.charAt(index)=='e'||input.charAt(index)=='i'||input.charAt(index)=='o'||input.charAt(index)=='u') {				 
        	     System.out.println(input.charAt(index) );
		     }
		}
	 }
 
	public static void main(String[] args) {
		
		Archana_Assignment_7 ass7 = new Archana_Assignment_7();
        ass7.evenchar("technocredits");
        ass7.vowels("technocredits");
	}

}
