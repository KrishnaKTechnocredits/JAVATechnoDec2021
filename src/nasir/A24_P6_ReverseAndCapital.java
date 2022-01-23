package nasir;
//WAP to reverse each word and convert first letter of each word into capital
public class A24_P6_ReverseAndCapital {
	String temp=" ";
	void setData(String input) {
		String[] output=input.split(" ");
		for(int index=0; index<output.length;index++) {
			String ans=output[index];
			reverseCapital(ans);
			temp=temp+" ";
		}
		temp=temp.trim();
		System.out.println(temp);
	}
	
	void reverseCapital(String word) {
		for(int index=word.length()-1; index>=0;index--) {
			char ch= word.charAt(index);
			String ans=ch+"";
			if(word.indexOf(ch)==word.length()-1) {
			ans=ans.toUpperCase();
		}
		temp=temp+ans;
	}
	}
	public static void main(String[] args) {
		A24_P6_ReverseAndCapital reverseAndCapital = new A24_P6_ReverseAndCapital();
		reverseAndCapital.setData(" Vrushali Sagar Shital" );
	}
}
