package apurva;

class ReverseString{

	void displayString(String s){
		int count = 0;
		System.out.println("Display given String");
		for(int index = 0; index<s.length();index++){
			count++;
			System.out.println("   " +s.charAt(index));
		}
	}
	
	void displayReverseString(String str){
		int count=0;
		System.out.println("Display reverse String");
		for(int index= str.length()-1;index>=0;index--){
			count++;
			System.out.println("   " +str.charAt(index));
		}
	}
	
	void countFrequency(String str, char ch){
		int count=0;
		System.out.println("Frequency count");
		for(int index=0; index<str.length();index++){
			if(str.charAt(index)==ch)
				count++;
		}
		System.out.println(ch + " Count is : "+count);
	}
	
	public static void main(String[] a){
		ReverseString reverseString = new ReverseString();
		reverseString.displayString("Apurva");
		System.out.println("------------------------------------------");
		reverseString.displayReverseString("Apurva");
		System.out.println("------------------------------------------");
		reverseString.countFrequency("apurva",'a');
	}	
	
}