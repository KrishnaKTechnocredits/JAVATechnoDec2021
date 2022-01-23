package shital;
import java.util.Arrays;

public class A24_ReverseEachWordOnSameIndex {

	String[] reverseWORDinSamePosition(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			
			String temp = "";
			for (int index2 = wordLength - 1; index2 >= 0; index2--) {
				char ch = word.charAt(index2);
				temp += ch;
			}
			arr[index] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_ReverseEachWordOnSameIndex reverseEachWordOnSameIndex=new A24_ReverseEachWordOnSameIndex();
		String[] name= reverseEachWordOnSameIndex.reverseWORDinSamePosition("Hi techno hello");
		System.out.println(Arrays.toString(name));
	}
}
