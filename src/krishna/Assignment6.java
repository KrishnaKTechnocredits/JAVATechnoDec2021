package krishna;

class Assignment6{
	void simpleString(String word){
		System.out.println("The String Character are : ");
		for(int index=0; index<word.length(); index++)
			System.out.println(word.charAt(index));
	}
	
	void revString(String word){
		System.out.println("The Reverse Character are : ");
		for(int index=word.length()-1; index>=0; index--)
			System.out.println(word.charAt(index));
	}
	
	void countString(String word, char ch){
		int count=0;
		for(int index=0; index<word.length(); index++){
			if(word.charAt(index) == ch)
				count++;
		}
		System.out.println("a->" +count);
	}
	
	public static void main(String[] arr){
			Assignment6 assignment6 = new Assignment6();
			assignment6.simpleString("techno");
			assignment6.revString("techno");
			assignment6.countString("akanksha", 'a');
	}
}