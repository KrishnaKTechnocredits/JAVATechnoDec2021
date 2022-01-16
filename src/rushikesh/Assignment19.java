package rushikesh;

public class Assignment19 {
//Assignment - 19 : 5th Jan'2022
	//
	//Print total Letters, Uppercase , Lowercase , Digits from given String.
	//
	//Input : TE1ch2noC2red9iTs
	//output :  Total Letters -> 13
//	               Total UpperCase characters -> 4
//	               Total LowerCase characters -> 9
//	               Total Digits -> 4

		int countLower;
		int countUpper;
		int countDigit;
		void countEverything(String input) {
			for(int index=0;index<input.length();index++) {
				char ch=input.charAt(index);			
				if(Character.isLetter(ch)){
					if(Character.isUpperCase(ch)) {
						countUpper++;
					}else {
						countLower++;
					}
				}else if(Character.isDigit(ch)) {
					countDigit++;
				}
			}
		System.out.print("Total Letters -> ");
		System.out.println(countUpper+countLower);
		System.out.println("Total Uppercase characters -> "+countUpper);
		System.out.println("Total Lowercase characters -> "+countLower);
		System.out.println("Total Digits -> "+countDigit);
		}
		public static void main(String[] args) {
			Assignment19 assignment19=new Assignment19();
			assignment19.countEverything("TE1ch2noC2red9iTs");
		}
}


