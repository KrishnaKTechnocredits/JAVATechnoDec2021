package omkar;

public class A7_Assignment {
	
	
	static void EvenPosition(String name) {
		for (int i=0; i<name.length(); i++){
			if ((i+1)%2== 0)
			
			System.out.print(name.charAt(i));
		}			
	 	
	}
	static void Vowel(String name){
		
			for (int i=0; i<name.length(); i++){
				
				char ch =name.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
								
					System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		EvenPosition("technocredits");
		System.out.println();
		Vowel("technocredits");
		System.out.println();

	}

}
