package debasmita;

public class A16_ArrayVowels {
	int VowelCount(String name) {
		int count=0;
		for(int i=0;i<name.length(); i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				count++;
			}
			
		}
		  System.out.println("total vowels in single element : "+count);
		  return count;
	}
	void totalVowelCount(String[] input) {
		int cnt=0;
		for(int index=0;index<input.length; index++) {
			int temp=VowelCount(input[index]);
			cnt=cnt+temp;
		}
		System.out.println("total vowels in the string are : "+cnt);
	}

	public static void main(String[] args) {
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		A16_ArrayVowels as16=new A16_ArrayVowels();
		as16.totalVowelCount(arr);
	}
}
