package shwetaBhosale;

class Assignment6{
 
	void printChar(String name){
		System.out.println("Chars of given name " +name+ " are:");
		for (int index=0; index<name.length(); index++)
			System.out.println(name.charAt(index));		
		}
		
	void printCharRev(String name){
		System.out.println("Chars of given name " +name+ " in reverse order is:");
		for (int index=name.length()-1; index>=0; index--)
			System.out.println(name.charAt(index));	
	}

	void countFreqOfChar(String name,char ch){
		System.out.println("Occurance of " +ch+ " in" +name+ ":");
		int count=0;
		for (int index=0; index<name.length(); index++){
			if(name.charAt(index) == ch)
				count++;
		}
			System.out.println(ch + "-" +count);
	}
	
	public static void main(String[] a){
		Assignment6 assignment6= new Assignment6();
		assignment6.printChar("techno");
		assignment6.printCharRev("techno");
		assignment6.countFreqOfChar("akanksha",'a');
	}

}












