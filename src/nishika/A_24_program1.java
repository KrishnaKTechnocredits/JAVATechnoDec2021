package nishika;
	
/* 1. WAP to find out total words in a given string & print each word with its length Input    : Hi Hello Output : Total 2 words               Hi --> 2               Hello --> 5 */

public class A_24_program1 {

		public static void main(String[] args) {
		
			String str = "Hi Hello";
	        String[] arr = str.split(" ");
	        for(int index=0; index <arr.length; index++) {
	             System.out.println(arr[index]+ "-->" + arr[index].length() );
	        }
}
}