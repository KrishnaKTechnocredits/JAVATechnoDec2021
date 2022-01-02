package kalyani;

public class A16_FindVowelsInStringArray {
	
	int count=0;
	void findCharCountFromString(String name) {
		int cnt =0;
		for (int index = 0; index < name.length();index++) {
			if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u' ) {
				count++;
				cnt++;
			}
		}
		System.out.println(name + " --> " + cnt );
	}
	
	void findVowelsCharCount(String[] input){
		for (int index=0; index<input.length; index++) {
			findCharCountFromString(input[index]);
		}	
		System.out.println("total vowels :" +count);
	}

	public static void main(String args[]) {
		A16_FindVowelsInStringArray assign16 = new A16_FindVowelsInStringArray();
		String [] name = {"Kalyani" , "Ragini" , "Abhijeet", "John"};
		assign16.findVowelsCharCount(name);
	}
}
