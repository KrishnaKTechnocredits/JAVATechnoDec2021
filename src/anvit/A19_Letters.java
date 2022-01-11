package anvit;

public class A19_Letters {
	
	void mainMethod(String name){
		int upperCnt = 0;
		int lowerCnt = 0;
		int digitCnt = 0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch))
					upperCnt++;
				else
					lowerCnt++;
			}
			if(Character.isDigit(ch))
				digitCnt++;
		}
		System.out.println("Total Letters -> "+(upperCnt+lowerCnt));
		System.out.println("Total UpperCase characters -> "+upperCnt);
		System.out.println("Total LowerCase characters -> "+lowerCnt);
		System.out.println("Total Digits -> "+digitCnt);
	}
	
	public static void main(String[] args) {
		A19_Letters a19_Letters = new A19_Letters();
		a19_Letters.mainMethod("TE1ch2noC2red9iTs");
	}
}
