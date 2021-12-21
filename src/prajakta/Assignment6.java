package prajakta;

class Assignment6{

    void printAllCharOfString(String name){
		System.out.println("All character of the String are : ");
		for(int index = 0; index < name.length(); index++){
		    char letter = name.charAt(index);
			System.out.println(letter);
	    }
	}
	
	void printAllCharOfStringInReverse(String name){
		System.out.println("All character of the String in reverse are : ");
		int endNum = name.length();
		for(int index = endNum - 1; index >= 0; index--){
			char letter = name.charAt(index);
			System.out.println(letter);
		}
	}

    void printCountOfCommonChar(String name){
	    int count = 0;
		System.out.println("Count of character A in the String : ");
		for(int index = 0; index < name.length(); index++){
			char letter = name.charAt(index);
			if(letter == 'a')
				count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.printAllCharOfString("Prajakta Shinde");
		assignment6.printAllCharOfStringInReverse("Prajakta Shinde");
		assignment6.printCountOfCommonChar("Prajakta Shinde");
	}	

}		