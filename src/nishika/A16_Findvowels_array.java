package nishika;

public class A16_Findvowels_array {

	int getFindVowel(String name) {
		int count = 0;
		for(int index=0 ; index<name.length(); index++) {
			if(name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i' || name.charAt(index) == 'o' || name.charAt(index) == 'u' )
				count++;
		}
		System.out.println(name + " ----> " + count);
		return count;
	}
	
	void findAllVowel(String[] input) {
		int cnt = 0;
		for(int index=0; index<input.length ; index++) {
			int var = getFindVowel(input[index]);
			cnt=var+cnt;
		}System.out.println("total vowels ------> " + cnt);
	}
	
	public static void main(String[] args) {
		String[] name = {"priyanka", "swati", "acharya", "hevin" };
		A16_Findvowels_array a16_Findvowels_array = new A16_Findvowels_array();
		a16_Findvowels_array.findAllVowel(name);
	
		
	}
	
}
