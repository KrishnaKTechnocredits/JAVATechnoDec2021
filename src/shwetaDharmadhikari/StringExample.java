package shwetaDharmadhikari;
class StringExample{
	int index=0;
	void printCharacters(String input){
		System.out.println("Output:");
		for (; index < input.length(); index++){
			System.out.println(input.charAt(index));
		}	
		System.out.println(" ");
	}
	
	void printReverseCharacters(String input){
		System.out.println("Characters in reverse order");
		for (index=input.length()-1; index >=0; index--){
			System.out.println(input.charAt(index));
		}
		System.out.println(" ");
	}
	
	void findCharFrequency(String input,char ch){
		int count=0;
		for (index=0; index < input.length(); index++){
			ch = input.charAt(index);
			if(ch == 'a')
				count++;
		}
		System.out.println("Output: "+count);
	}
	
	public static void main(String args[]){
		StringExample stringExample = new StringExample();
		stringExample.printCharacters("shweta");
		stringExample.printReverseCharacters("Shweta");
		stringExample.findCharFrequency("dhArmadhikari",'a');}
}