package yogeshNagar;

public class A16_GetAllVowelFromNameArray {
	
	int countFrequencyOfVowel(String name) {
		int cnt=0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u') {
				cnt++;
			}
		}		
		return cnt;
	}
	
	void getFrequencyOfVowelArray(String[] name) {
		int count=0;
		for(int index=0;index<name.length;index++) {
			int vowelCount = countFrequencyOfVowel(name[index]);
			count = count+vowelCount;	
			System.out.println(name[index]+ "-->"+ vowelCount);
		}		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		A16_GetAllVowelFromNameArray getVowelFromArray = new A16_GetAllVowelFromNameArray();
		String[] nameArray = {"priyanka", "swati", "acharya", "hevin"};
		getVowelFromArray.getFrequencyOfVowelArray(nameArray);
	}
}