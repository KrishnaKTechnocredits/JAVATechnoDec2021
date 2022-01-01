package kalyani;

class A17_findMaxVowelWord {

	void findMaxVowelsFromArray(String[] input){
		String name = " ";
		int cnt=0;

		for(int index=0; index<input.length;index++){
			String vowelName =input[index];
			int count=0;	

			for(int i=0; i<vowelName.length();i++){
			     if(vowelName.charAt(i)=='a'|| vowelName.charAt(i)=='e'|| vowelName.charAt(i)=='i'||vowelName.charAt(i)=='o'||vowelName.charAt(i)=='u')
					count++;
			}
			System.out.println("total count of vowels in " + vowelName + " is : " + count);
			if(count>cnt){
				cnt=count;
				name=vowelName;
			}
		}
		System.out.println("Name having maximum count of vowels is  : "+name);
	}

	public static void main(String[]args){
		A17_findMaxVowelWord maxvowels = new A17_findMaxVowelWord();
		String[] name = {"hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		maxvowels.findMaxVowelsFromArray(name);
	}
} 