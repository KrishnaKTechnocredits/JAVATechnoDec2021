package shital;
import java.util.Arrays;

public class A24_convertFirstCharacterofWordCapitalLetter {

	String[] convertFirstWordinCapital(String str) {
		String[] arr=str.split(" ");
		for(int index=0;index<arr.length;index++) {
			int wordLength=arr[index].length();
			String word=arr[index];
			
			String temp="";
			temp=temp+Character.toUpperCase(word.charAt(0));
			for(int i=1;i<word.length();i++) {
					temp=temp+word.charAt(i);
			}
			arr[index] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_convertFirstCharacterofWordCapitalLetter convertFirstCharacterofWordCapitalLetter=new A24_convertFirstCharacterofWordCapitalLetter();
		String[] arr=convertFirstCharacterofWordCapitalLetter.convertFirstWordinCapital("anvit harsh dipali");
		System.out.println(Arrays.toString(arr));
	}

}
