//print count of vowels in each input from String array and print total vowels.
package monikaArkade;

public class A16_Assignment16 {
	int count=0;
	void findCharFromString(String name) {
		int cnt=0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u') {
				cnt++;
				count++;
			}
		}
		System.out.println(name+" -> "+cnt);
	}
	
	void findCharFromArray(String[] input) {
		for(int index=0;index<input.length;index++) {
			findCharFromString(input[index]);
		}
		System.out.println("Toal vowels count: "+count);
	}
	
	public static void main(String[] args) {
		A16_Assignment16 vowels = new A16_Assignment16();
		String[] input = {"priyanka", "swati", "acharya", "hevin"};
		vowels.findCharFromArray(input);
	}

}
