package ashok;
class A6_ssignment6{
	
	void printName(String name){
		for(int index=0; index<name.length(); index++){
			System.out.println(name.charAt(index));
		}
	}
	
	void reverseName(String name){
		for(int index=name.length()-1; index>-1 ; index--){
			System.out.println(name.charAt(index));
		}
	}
	
	void countName(String name, char ch){
		int count = 0;
		for(int index=0; index<name.length() ; index++){
			if(name.charAt(index) == ch){
				count++;
			}
		}
		System.out.println(count);
	}
		
	public static void main(String[] args){
		A6_ssignment6 assignment6 = new A6_ssignment6();
		System.out.println("Print Name");
		assignment6.printName("Ashok");
		System.out.println("Reverse Name");
		assignment6.reverseName("Vishwakarma");
		System.out.println("Count repeat charcter");
		assignment6.countName("Techno credit",'e');
	}

}
