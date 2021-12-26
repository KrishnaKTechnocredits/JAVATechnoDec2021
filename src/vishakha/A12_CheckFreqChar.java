package vishakha;

public class A12_CheckFreqChar {
	static String str;

	void checkFreqOfchar(String name) {
		for (int index = 0; index < name.length(); index++) {
			char c = name.charAt(index);
			int charCnt = 0;
			for (int index2 = 0; index2 < name.length(); index2++) {
				if (name.charAt(index2) == c) {
					charCnt++;
				}
			}
			str = "Character : " + c + "  : " + charCnt;
			if (charCnt > 0)
				System.out.println("Character : " + c + " : " + charCnt);
		}
	}

	public static void main(String[] args) {
		A12_CheckFreqChar freq = new A12_CheckFreqChar();
		freq.checkFreqOfchar("vishakha");
	}
}
