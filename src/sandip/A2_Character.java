package sandip;

class A2_Character{
	
	void printChar(String name){
		for(int index=0; index<name.length();index++){
			System.out.println(name.charAt(index));
		}
	}
	
	void reverseCh(String name){
		for(int index=name.length()-1; index>=0;index--)
			System.out.println(name.charAt(index));
	}
	
	void charFreq(String name, char a){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)==a)
				count++;
		}
		System.out.println("Input "+name);
		System.out.println(a+ "-"+count);
	}
	public static void main(String[] args){
		A2_Character cha01=new A2_Character();
		cha01.printChar("techno");
		cha01.reverseCh("techno");
		cha01.charFreq("Helloo",'l');
	}
}

