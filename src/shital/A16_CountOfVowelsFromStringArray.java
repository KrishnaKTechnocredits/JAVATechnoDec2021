package shital;

class A16_CountOfVowelsFromStringArray{

	
	int totalCount=0;
	
	void findVowel(String name){
		int count=0;
		for(int index=0;index<name.length();index++){
			if(name.charAt(index)== 'a' || name.charAt(index)== 'e' || name.charAt(index)== 'i' || name.charAt(index)== 'o'  || name.charAt(index)== 'u' )
				count++;
		}
		totalCount=totalCount+count;
		System.out.println(name+"-"+count);
	}
	
	void countOfVowelFromArray(String[] input){
		for(int index=0;index<input.length;index++){
			findVowel(input[index]);
		}
		System.out.println("Total Count of Vowel is: "+totalCount);
	}
	
	public static void main(String[] args){
		A16_CountOfVowelsFromStringArray counOfVowel=new A16_CountOfVowelsFromStringArray();
		String[] name = {"priyanka", "swati", "acharya", "hevin"};
		System.out.println("****count of vowels in each input from String array****");
		counOfVowel.countOfVowelFromArray(name);
		
	}
}


