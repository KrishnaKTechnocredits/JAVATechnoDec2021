package kalyani;

class StringDemo {

	void printString(String name) {
		System.out.println("String is :");
		for(int index =0; index<name.length();index++) {
		System.out.println(name.charAt(index));
		}
	}
	
	void findFreqOfChar(String input,char ch){
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch);
				count++;
		}
		System.out.println("count of :");
		System.out.println(ch + "--" + count);
	}
	
	void revStrg(String name){
		System.out.println("Reverse the String");
		for(int index =name.length()-1;index>=0;index--){
			System.out.println(name.charAt(index));
		}
	}	
	
	public static void main(String args[]){
		StringDemo stringdemo = new StringDemo();
		stringdemo.printString("Kalyani");
		stringdemo.revStrg("Kalyani");
		stringdemo.findFreqOfChar("Kalyani",'a');
	}
}