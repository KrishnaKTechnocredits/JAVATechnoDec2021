package anjali;

public class A7_assigment7 {

	public static void main(String[] args) {
		A7_assigment7 a7=new A7_assigment7();
		a7.printAtEven("Anjali");
		a7.PrintVowel("anjaliu");
		
		
	}
	
	void printAtEven(String name){
		for(int index=0; index<name.length(); index++){
			if(index%2==0)
				System.out.println(name.charAt(index));
		}
	}
	
	void PrintVowel(String name){
		for(int index=0; index<name.length(); index++){
			if(name.charAt(index)=='a' || name.charAt(index)=='e' ||name.charAt(index)=='i'|| name.charAt(index)=='o' ||name.charAt(index)=='u')
				System.out.println(name.charAt(index));
		}
		
	}

}
