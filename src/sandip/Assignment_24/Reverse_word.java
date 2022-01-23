package sandip.Assignment_24;

import java.util.Arrays;

public class Reverse_word {

	void splitWords(String s1) {
		String[] s2=s1.split(" ");
		String[] output=new String[s2.length];
		for(int index=0; index<s2.length ; index++) {
			output[index]=reverseString(s2[index]);
		}
		System.out.println(Arrays.toString(output));
	}
	
	String reverseString(String s3) {
		String temp=""; 
		for(int index=s3.length()-1 ; index>=0; index--) {
			char ch=s3.charAt(index);
			temp=temp+ch;
		}
		return temp;
	}
	
	void method2(String s1) {
		String temp="";
		String[] arg=s1.split(" ");
		for(int index=0 ; index<arg.length ; index++) {
			temp = temp+" "+reverseString(arg[index]);
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		Reverse_word r1 = new Reverse_word();
		r1.splitWords("hi heloo how are you");
		r1.method2("hi hello how are you");
	}
}
