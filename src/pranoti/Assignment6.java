package pranoti;

class Assignment6{
	
	void printChar(String name){
		System.out.println("characters of given name " +name+ " are:");
		for(int index = 0;index<name.length();index++)
			System.out.println(name.charAt(index));
		
	}
	
	void printCharReverse(String name){
		System.out.println("characters of given name " +name+ " in reverse order:");
		for(int index =name.length()-1;index>=0;index--)
			System.out.println(name.charAt(index));
	}
	
	void countFreqOfChar(String name,char ch){
		System.out.println("occurance of " +ch+ " in " +name+ ":");
		int count =0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + "-" +count);
	}
	
	public static void main(String[]args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.printChar("techno");
		assignment6.printCharReverse("techno");
		assignment6.countFreqOfChar("akanksha" ,'a');
	}
}