package krishna;

public class Test1_NonRepeatingChar {

	void fNonRepeat(String word) {
		for(int i= 0; i<word.length(); i++) {
			int temp = 0;
			for(int j= 0; j<word.length(); j++) {
				if(word.charAt(i) == word.charAt(j)) 
					temp++;
			}
			if(temp ==1) {
				System.out.println("The first non repeating charater are : " +word.charAt(i));
				break;
			}
				
			
		}
			
		
	}
	
	
	public static void main(String[] args) {
		Test1_NonRepeatingChar test= new Test1_NonRepeatingChar();
		test.fNonRepeat("technocredits");
	}
	
}