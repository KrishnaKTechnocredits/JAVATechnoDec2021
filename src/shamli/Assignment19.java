package shamli;
/*
Print total Letters, Uppercase , Lowercase , Digits from given String.
Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4
 */
public class Assignment19 {

		int uCaseCnt = 0;
		int lCaseCnt = 0;
		int digitCnt = 0;
		
		void countGivenStringChartype(String str) {
			for(int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if(Character.isLetter(ch)) {
					if(Character.isUpperCase(ch))
						uCaseCnt++;
					else
						lCaseCnt++;
				}
				else if(Character.isDigit(ch))
					digitCnt++;
				}	
			}
		

		public static void main(String[] args) {
			Assignment19 assignment19 = new Assignment19();
			assignment19.countGivenStringChartype("TE1ch2noC2red9iTs");
			System.out.println("Total no. of Letters in the given string : " + (assignment19.uCaseCnt + assignment19.lCaseCnt));
			System.out.println("Total no. of Upper Case letters in the given string : " + assignment19.uCaseCnt);
			System.out.println("Total no. of Lower Case letters in the given string : " + assignment19.lCaseCnt);
			System.out.println("Total no. of Digits in the given string : " + assignment19.digitCnt);

		}
}
