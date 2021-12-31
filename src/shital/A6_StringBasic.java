package shital;

class A6{
	
	void display(String name){
		System.out.println("Print all Character: ");
		for(int index=0;index<name.length();index++){
			System.out.println(name.charAt(index));
		}
	}

	void reverse(String name){
		System.out.println("Print all Character in Reverse Order:");
		for(int index=name.length()-1;index>=0;index--){
			System.out.println(name.charAt(index));
		}
	}
	
	void charCount(String name, char ch){
		System.out.println("occurance of given character from input string: ");
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index) == ch)
			count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args){
		A6 assignment6=new A6();
		assignment6.display("shitalkadam");
		assignment6.reverse("techno");
		assignment6.charCount("technocredit",'c');
	}
}