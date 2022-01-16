package ashok;

public class A16_array_assignment {
	
	int count=0;
	void findCharCountFromString(String name) {
		int cnt = 0;
		for(int index=0; index< name.length();index++) {
			if(name.charAt(index)=='a' || name.charAt(index)=='e' ||name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u') {	
				count++;
				cnt++;
			}
		}
		System.out.println(name+ " -->"+ cnt);
	}
	
	void findCharCountFromArray(String[] input) {
		for(int index=0; index<input.length;index++) {
			findCharCountFromString(input[index]);
		}
		System.out.println("Total Vowels -->"+ count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"priyanka", "swati", "acharya", "hevin" };
		new A16_array_assignment().findCharCountFromArray(name);
	}

}
