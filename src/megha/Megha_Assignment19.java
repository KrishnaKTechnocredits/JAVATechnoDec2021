package megha;

public class Megha_Assignment19 {
	
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
		Megha_Assignment19 megha_Assignment = new Megha_Assignment19();
		megha_Assignment.countGivenStringChartype("TE1ch2noC2red9iTs");
		System.out.println("Total no. of Letters in the given string : " + (megha_Assignment.uCaseCnt + megha_Assignment.lCaseCnt));
		System.out.println("Total no. of Upper Case letters in the given string : " + megha_Assignment.uCaseCnt);
		System.out.println("Total no. of Lower Case letters in the given string : " + megha_Assignment.lCaseCnt);
		System.out.println("Total no. of Digits in the given string : " + megha_Assignment.digitCnt);

	}

}
