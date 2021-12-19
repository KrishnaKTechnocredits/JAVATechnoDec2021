package hevin;

class Assignment6{

	void displayChar(String name){
		for(int index=0;index<name.length();index++){
			System.out.println(name.charAt(index));
		}
	}
	
	void reverseChar(String name){
		for(int index=name.length()-1;index>=0;index--){
			System.out.println(name.charAt(index));
		}
	}	
	void countChar(String name, char ch){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index) == ch)
				count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] a){
		Assignment6 assignment6 = new Assignment6();
		System.out.println("Name as per index :");
		assignment6.displayChar("  Hevin");
		System.out.println("Name in Reverse :");
		assignment6.reverseChar("  Hevin");
		System.out.println("Count Character From name :");
		assignment6.countChar("  Hevin Patel",'e');
	}
}