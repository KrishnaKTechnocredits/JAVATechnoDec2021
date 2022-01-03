package priya;

public class A16_Vowels{
		int count=0;
		
		void findVowelsFromString(String name) {
			int count1 = 0;
			for(int index=0; index< name.length();index++) {
				if(name.charAt(index)=='a' || name.charAt(index)=='e' ||name.charAt(index)=='i' || name.charAt(index)=='o' || name.charAt(index)=='u') {	
					count1++;
					count++;
				}
			}
			System.out.println("Total count of vowels in "+name+" is:" +count1);
		}

		void countTotalVowels(String[] input) {
			for(int index=0; index<input.length;index++) {
				findVowelsFromString(input[index]);
			}
			System.out.println("Total count of vowels is:" + count);
		}

		public static void main(String[] args) {
			String[] name = {"Priyanka", "Swati", "Anagha", "Rahul" };
			new A16_Vowels().countTotalVowels(name);
		}
	}

