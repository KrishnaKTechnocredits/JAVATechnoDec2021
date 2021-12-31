package swati;

public class A16_Vowels {

	int findNumOfVowels(String name) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'|| name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
	void findVowel(String name[]) {
		int sum=0;
		for(int i=0;i<name.length;i++) {
			int count=findNumOfVowels(name[i]);
			System.out.println("No Vowels in " +name[i] + " are "+count);
			sum=sum+count;
		}
		System.out.println("Sum of Vowels "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A16_Vowels a16=new A16_Vowels();
		String[] name = {"priyanka", "swati", "acharya", "hevin" };
		a16.findVowel(name);
		
	}

}
