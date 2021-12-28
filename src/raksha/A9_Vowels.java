package raksha;

public class A9_Vowels {
	
	void printEven(String input){
		System.out.println("Characters at even position for " +input+ " are: ");
		for(int i=0; i<input.length();i++)
		{
			if(i % 2 == 1)
				System.out.println(input.charAt(i));
		}
		
	}
	
	void findVowels(String input){
		System.out.println("Vowels in given input " +input+ " are: ");
		for(int index=0; index<input.length();index++)
		{
			if(input.charAt(index)=='a'|| input.charAt(index)=='e'|| input.charAt(index)=='i' ||input.charAt(index)=='o'|| input.charAt(index)=='u')
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A9_Vowels a9_Vowels = new A9_Vowels();
		a9_Vowels.printEven("technocredits");
		
		a9_Vowels.findVowels("technocredits");

	}

}
