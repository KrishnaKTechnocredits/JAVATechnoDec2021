package shital;

class Test1Program1{
	
	int findChar(String name, char ch){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==ch){
				count++;
			}
		}
		return count;
	}
	
	void findRepeatedChar(String name){
		int count;
		System.out.println("Given String is: "+name);
		for(int index=0;index<name.length();index++){
			
			 count=findChar(name,name.charAt(index));
			
			if(count==1){
				System.out.println("First non repeating Char is: "+name.charAt(index));
			}
		}
	}
	
	public static void main(String[] args){
		Test1Program1 test1program1=new Test1Program1();
		test1program1.findRepeatedChar("shitals");
	}
}