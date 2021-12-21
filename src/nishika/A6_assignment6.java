package nishika;

class A6_assignment6{
	static void printChar(String name){
			for(int index=0; index<name.length(); index++)
				System.out.println(name.charAt(index));
	}

	static void printReverseChar(String name){
		for(int index=name.length()-1; index>=0;index--)
			System.out.println("__"+name.charAt(index)+"__");
	}

	void countChar(String name , char ch){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==ch)
				count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args){
		A6_assignment6 a6_assignment6 = new A6_assignment6();
		a6_assignment6.printChar("techno");
		a6_assignment6.printReverseChar("techno");
		System.out.println("");
		a6_assignment6.countChar("technocredits",'t');
	} 
}