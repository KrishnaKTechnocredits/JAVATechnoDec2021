package ranjeet;
class A6_ranjit{

	void printChar(String str){
		//System.out.println(str);
		for(int i=0; i<str.length(); i++){
			System.out.println(str.charAt(i));
		}
			System.out.println("-------------");
			printCharInReverseOrder(str);
	}
	
	void printCharInReverseOrder(String str){
		for(int i = str.length()-1; i>0; i--){
			System.out.println(str.charAt(i));
		}
	}
	
	void printCharOccurance(String str, char ocrr){
		int count = 0;
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == ocrr){
				count++;
			}
		}
			System.out.println("In "+str+ " character " +ocrr+" occoured " +count);
	}
	
	public static void main(String[] args){
		A6_ranjit assignmentSixBasicString = new A6_ranjit();
		assignmentSixBasicString.printChar("techno");
		assignmentSixBasicString.printCharOccurance("technoe", 'e');
		assignmentSixBasicString.printCharOccurance("Ranjeet", 'a');
	}
}