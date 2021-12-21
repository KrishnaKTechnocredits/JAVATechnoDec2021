package monikaBhurey;
class Characters {
	void allCharacters(String name){
		for(int index=0;index<name.length();index++){
			System.out.println(name.charAt(index));
		}	
		System.out.println(".........................................");
	}
	
	void reverseCharacters(String name){
		for(int index=name.length()-1;index>=0;index--){
			System.out.println(name.charAt(index));
		}	
	}	
	void findFreqOfCharcters(String name, char ch){
		int count=0;
		for(int index=0;index<name.length();index++){			
			if(name.charAt(index)==ch)
			count++;						
		}
		System.out.println("Frequency of character is "+count);		
	}
	
	public static void main(String[]args){
		Characters characters =new Characters();
		characters.allCharacters("Monika");
		characters.reverseCharacters("Monika");
		characters.findFreqOfCharcters("Monika",'a');
	}
}