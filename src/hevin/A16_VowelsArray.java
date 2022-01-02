package hevin;

public class A16_VowelsArray {

	int count=0;
	
	void findVowelsFromString(String name) {
		int cnt = 0;
		for(int index=0; index< name.length();index++) {
			if(name.charAt(index)=='a' || name.charAt(index)=='e' ||name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u') {	
				count++;
				cnt++;
			}
		}
		System.out.println(name+ " --> " + cnt);
	}

	void countTotalVowels(String[] input) {
		for(int index=0; index<input.length;index++) {
			findVowelsFromString(input[index]);
		}
		System.out.println("Total Vowels --> " + count);
	}

	public static void main(String[] args) {
		String[] name = {"priyanka", "swati", "acharya", "hevin" };
		new A16_VowelsArray().countTotalVowels(name);
	}
}