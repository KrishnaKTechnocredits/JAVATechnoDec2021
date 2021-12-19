package yogeshNagar;

class A6_NameCharacter{
	
	void displayNameCharacter(String name){
		for(int index=0;index<name.length();index++){
			System.out.println(name.charAt(index));
		}
	}
	
	void reverseNameCharacter(String name){
		for(int index=name.length()-1;index>=0;index--){
			System.out.println(name.charAt(index));
		}
	}
	
	void countCharcter(String name, char ch){
		int count = 0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index) == ch)
				count++;
		}
		System.out.println(count);		
	}
	
	public static void main(String[] args){
		A6_NameCharacter nameCharacter = new A6_NameCharacter();
		System.out.println("-------Name as per index --------");
		nameCharacter.displayNameCharacter("Yogesh");
		System.out.println("--------Reverse Name ------------");
		nameCharacter.reverseNameCharacter("Yogesh");
		System.out.println("--------Count Character ------------");
		nameCharacter.countCharcter("Techno credits",'e');
	}	
}