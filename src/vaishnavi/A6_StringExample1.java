package vaishnavi;
class A6_StringExample1 {

	void displayChar(String name) {
		for(int index=0;index<name.length();index++)
			System.out.println(name.charAt(index));
	}
	
	void reverseChar(String name) {
		System.out.println("Reverse string is :");
		for(int index=name.length()-1;index>=0;index--)
			System.out.println(name.charAt(index));
	}
	
	void findFreqOfString(String name) {
		int count = 0;
		System.out.println("Occurence of character A in the string is ");
		for(int index=0; index < name.length(); index++) {
			char ch= name.charAt(index);
			if(ch== 'a')
				count++;
	}
		System.out.println(count);
}
	
	public static void main(String[] args) {
		A6_StringExample1 stringexample1 =new A6_StringExample1();
		stringexample1.displayChar("Vaishnavi");
		stringexample1.reverseChar("Vaishnavi");
		stringexample1.findFreqOfString("Vaishnavi");
	}

}
