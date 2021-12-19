package omkar;

class NameString{
	static void display (String name){
		for (int i=0; i<name.length(); i++){
			System.out.println(name.charAt(i));
		}	
	
	}
	static void revers(String name){
		for (int i=name.length()-1; i>=0; i--){
			System.out.println(name.charAt(i));
		}
	}
	static void findCharFreq(String input, char ch){
		int count =0;
		for (int i=0; i<input.length(); i++){
			if (input.charAt(i)  == ch)
				count++;
		}	
		System.out.println("count of a is " +count);
	}
	public static void main(String[] args){
		display("techno");
		System.out.println();		
		revers("techno");
		System.out.println();
		findCharFreq("akanksha",'a');
	}
}