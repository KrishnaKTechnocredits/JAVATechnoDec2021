package monikaArkade;

class A7_StringOperations{
	String input = " ";
	void charAtEvenPosition(String inputString){
		for(int index=0;index<inputString.length();index++){
			if((index+1)%2==0)
				input = input + inputString.charAt(index);
		}
		System.out.println("Characters are at even position : "+input);
	}
	
	void vowels(String inputString){
		String input = " ";
		for(int index=0;index<inputString.length();index++){
			if(inputString.charAt(index)=='a' || inputString.charAt(index)=='e' || inputString.charAt(index)=='i' || inputString.charAt(index)=='o' || inputString.charAt(index)=='u')
				input = input + inputString.charAt(index);
		}
		System.out.println("Vowels are : "+input);
	}
	public static void main(String[] args){
		A7_StringOperations a7_StringOperations = new A7_StringOperations();
		a7_StringOperations.charAtEvenPosition("technocredit");
		a7_StringOperations.vowels("technocredit");
	}
}


	
	
