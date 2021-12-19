package monikaArkade;

public class StringOperations {
	void findFreqOfChar(String input,char ch) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("Count of "+ ch + " is : "+ count);
	}
	
	public static void main(String[] args) {
		StringOperations stringOperations = new StringOperations();
		stringOperations.findFreqOfChar("monikaarkade", 'a');
	}
}
