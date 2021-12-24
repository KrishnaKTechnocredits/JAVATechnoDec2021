package nasir;
class A7_Vowels {
	void evenPosition(String input){
		for(int index=0;index<input.length();index++){
			if(index%2!=0)
				System.out.println(input.charAt(index));
		}		
		System.out.println("...........................");
	}
	
	void vowelsCh(String input){
		for(int index=0;index<input.length();index++){
			char ch1='a';
			char ch2='e';
			char ch3='i';
			char ch4='o';
			char ch5='u';
			if(input.charAt(index)==ch1 || input.charAt(index)==ch2 || input.charAt(index)== ch3 || input.charAt(index)==ch4 || input.charAt(index)== ch5)
				System.out.println(input.charAt(index));
		}
	}
	
	public static void main(String[]args){
		A7_Vowels vowels =new A7_Vowels();
		vowels.evenPosition("technocredits");
		vowels.vowelsCh("technocredits");
		
	}
}