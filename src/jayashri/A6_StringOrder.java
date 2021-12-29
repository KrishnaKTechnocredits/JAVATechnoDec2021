package jayashri;

class A6_StringOrder{
	
	void printAllChar(String name){
		System.out.println("Characters of given string are :");
		for(int i = 0;i<name.length();i++)
			System.out.println(name.charAt(i));	
	}
	
	void charFreq(String name,char ch){
		System.out.println("occurance of " +ch+ " in given string is :");
		int count =0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) == ch)
				count++;
		}
		System.out.println(ch + "->" +count);
	}
	
	void printReverseChar(String name){
		System.out.println("Characters of given string in reverse order are: ");
		for(int i = name.length()-1;i>=0;i--)
			System.out.println(name.charAt(i));
	}
	
	public static void main(String[]args){
		A6_StringOrder a6_stringorder = new A6_StringOrder();
		a6_stringorder.printAllChar("techno");
		a6_stringorder.printReverseChar("techno");
		a6_stringorder.charFreq("jayashri" ,'a');
	}
}