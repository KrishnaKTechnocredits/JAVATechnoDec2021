package nasir;
class A16_ArrayVowels{
	int cnt;
	void findVowels(String input){
		int count=0;
		//System.out.println(input.length);
		for(int index=0; index<input.length(); index++){
			char ch=input.charAt(index);
			if(ch=='a'||ch== 'e' || ch=='i' || ch=='o' || ch== 'u'){
				count++;
				cnt++;
			}
		}
			System.out.println(input+" has total count of vowels are "+count);
	}
	
	void arrayName(String[] input){
		
		for(int index=0;index<input.length; index++){
			String name = input[index];
			findVowels(name);
		
	}
		System.out.println("Total Count of Vowels are "+cnt);
	}
	
	public static void main(String[]args){
		A16_ArrayVowels arrayvowels = new A16_ArrayVowels();
		String[] name = {"priyanka", "swati", "acharya", "hevin"};
		arrayvowels.arrayName(name);
		//arrayvowels.findVowels(name);
	}

}