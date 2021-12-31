package krishna;

public class Assignment_11_OccuranceOfCharacter {
	int strLen = 0;
	int count = 0;
	
	int getLengthOfString(String input) {
		int strLen=input.length();
		System.out.println( "The Length of the charater are : " +strLen);
		return strLen;
	}
	
	int getCharFirstOccurence(String input,char ch) {
		boolean flag=false;
		int i;
		
		for(i = 0; i<input.length(); i++) {
			if(input.charAt(i) == ch) {
				System.out.println("First Character found at : " +i);
				flag = true;
				break;
			}
			if(flag == true) 
				break;
		}			
				
		if(flag ==true) {
			System.out.println(" Entered Character Found");
		}else {
			System.out.println("Character Not Found");
		}
		return i;
	}
		
	int getLastOccurence(String input,char ch){
		int count = 0;
		int index=0;
		int i = 0;
		for(  ; i<input.length(); i++){
			if(input.charAt(i) == ch){
				index = i;
				count++;
			}
			
		}			
		if(index != 0){
			System.out.println("Last Character found at :  " +index );
			System.out.println("The total number of occurance : " +count);
		}
		return i;
	}
		
	public static void main(String[] args) {
		Assignment_11_OccuranceOfCharacter assignment_11_OccuranceOfCharacter = new Assignment_11_OccuranceOfCharacter();
		assignment_11_OccuranceOfCharacter.getLengthOfString("krrishaw"); 
		assignment_11_OccuranceOfCharacter.getCharFirstOccurence("krrishaw", 'r');
		assignment_11_OccuranceOfCharacter.getLastOccurence("krrishaw", 'h');
	}
}

