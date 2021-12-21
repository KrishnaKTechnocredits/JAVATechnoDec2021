package priyankaZende;
class A61_StringDemo{
	void printAllCharsFromString(String name){
		System.out.println("Print all chars from string:" + "\n");
		for(int index=0;index < name.length();index++){
			System.out.print(name.charAt(index) + "\t" + (index+1));
		}
		System.out.println();
	}
	
	void reverseString(String name){
		System.out.println("Print reverse string:" + "\n");
		for(int index=name.length()-1; index >= 0; index--){
			System.out.print(name.charAt(index) + "\t");
		}
	}

	public static void main(String[] args){
		A61_StringDemo stringDemo = new A61_StringDemo();
		stringDemo.printAllCharsFromString("Technocredits");
		stringDemo.reverseString("Technocredits");
	}
}	
	