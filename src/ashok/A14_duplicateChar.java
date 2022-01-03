package ashok;

public class A14_duplicateChar {
	
	void duplicateCount(String str) {
		String temp = "";
		int duplicatecnt = 0; 		
		int uniquecnt = 0;
		
		for(int index = 0 ; index < str.length() ; index++) {
			char ch = str.charAt(index);
			String s = ch + "";
				if(!temp.contains(s)) {
					if(str.indexOf(ch) != str.lastIndexOf(ch)) {
						duplicatecnt++;
					}
					if(str.indexOf(ch) == str.lastIndexOf(ch)) {
					uniquecnt++;
					}
					temp = temp + ch;
					}
				}
				System.out.println(duplicatecnt);
				System.out.println(uniquecnt);
				if(duplicatecnt < uniquecnt ) {
					System.out.println("Seleiumn");
				}else {
					System.out.println("Java");
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14_duplicateChar a14_duplicateChar = new A14_duplicateChar();
		System.out.println("input : technocredits and Output : Selenium");
		a14_duplicateChar.duplicateCount("technocredits");
		System.out.println("input : abcdabc and Output : Java");
		a14_duplicateChar.duplicateCount("abcdabc");
	}

}
