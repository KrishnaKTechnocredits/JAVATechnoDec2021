class Assignment6 {
	void printChar(String name) {
		System.out.println("characters of the name " +name+ " are:");
		for(int index =0;index<name.length();index++)
			System.out.println(name.charAt (index));
	}
	
	void printCharRev(String name) {
		System.out.println("characters of the name " +name+ " in reverse order:");
		for(int index=name.length()-1;index>=0;index--)
			System.out.println(name.charAt (index));
		
	}
	
	void countFreqOfChar(String name , char ch) {
		System.out.println("Occurence of " +ch+ " in " +name+ ":");
		int count=0;
		for(int index =0;index<name.length();index++){
			if(name.charAt(index) ==ch)
				count++;
	}
			System.out.println(ch + "-" +count);
	}
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.printChar("abhishek");
		assignment6.printCharRev("abhishek");
		assignment6.countFreqOfChar("anand" , 'a');
		assignment6.countFreqOfChar("anand" , 'n');
	}
}
		
		