package rohini.Rohini_Assignment24;

/*4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"*/

public class Program4 {

	public void reverseWord(String str) {
		String[] s=str.split(" ");
		for(int index=0;index<s.length;index++) {
			String temp="";
			String s2=s[index];
			for(int index1=s2.length()-1;index1>=0;index1--) {
				char ch=s2.charAt(index1);
				temp+=ch;
				//System.out.println(ch);
			}
			System.out.println(temp);

		}
	}

	public static void main(String[] args) {
		Program4 prg4=new Program4();
		prg4.reverseWord("Hi techno hello");
	}

}
