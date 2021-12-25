package yogeshNimbalkar;

public class Test1_FirstNonRepeatChar {

	void getNonReatChar(String str) {
		for(int index=0; index < str.length(); index++) {
			boolean flag = true;
			for(int index1=0; index1 < str.length();index1++) {
				if(index != index1 && str.charAt(index)==str.charAt(index1)){
					flag = false;
					break;				
				}
				
			}
			if(flag == true) {
				System.out.println(str.charAt(index));
				break;
			}
		}
	}
	public static void main(String[] args) {
		Test1_FirstNonRepeatChar firstNonRepatChar = new Test1_FirstNonRepeatChar();
		firstNonRepatChar.getNonReatChar("technocredits");
	}
}
