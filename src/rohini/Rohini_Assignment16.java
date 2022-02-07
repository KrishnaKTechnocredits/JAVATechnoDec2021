package rohini;


public class Rohini_Assignment16 {


		
		int findVowelCountInString(String str) {
			int cnt =0;
			for(int index=0; index<str.length(); index++) {
				char ch = str.charAt(index);
				if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' ||ch == 'I' || ch == 'i' ||ch == 'O' || ch == 'o' ||ch == 'U' || ch == 'u' )
					cnt++;
			}
			System.out.println(str +" And count of vowels is "+ cnt);
			return cnt;
		}
		
		void findCountOfVowelsInStringArray(String[] arr) {
			int count=0;
			for(int index=0; index<arr.length; index++) {
				count = count + findVowelCountInString(arr[index]);
			}
				
			System.out.println("Total vowels Count in array "+count);
		}
		
		public static void main(String[] a) {
			Rohini_Assignment16 CountVowel = new Rohini_Assignment16();
			String[] arr= {"priyanka", "swati", "acharya", "hevin","Rohini","Mayank","Suraj" };
			CountVowel.findCountOfVowelsInStringArray(arr);
		}
		

	}
