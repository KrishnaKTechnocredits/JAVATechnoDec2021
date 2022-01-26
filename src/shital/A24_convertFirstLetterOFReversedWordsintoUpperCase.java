package shital;

public class A24_convertFirstLetterOFReversedWordsintoUpperCase {

	void reversedWords_convertFirstLetter(String str) {
		String[] arr=str.split(" ");
		for(int index=0;index<arr.length;index++) {
			int wordLength=arr[index].length();
			String word=arr[index];
			System.out.println(word);
			
			String temp="";
			temp=temp+Character.toUpperCase(word.charAt(wordLength-1));
			for(int i=wordLength-2;i>=0;i--) {
				temp=temp+word.charAt(i);
				arr[index]=temp;
			}
			//System.out.println(wordLength);
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_convertFirstLetterOFReversedWordsintoUpperCase obj=new A24_convertFirstLetterOFReversedWordsintoUpperCase();
		obj.reversedWords_convertFirstLetter("Vrushali Sagar Shital");
	}
}
