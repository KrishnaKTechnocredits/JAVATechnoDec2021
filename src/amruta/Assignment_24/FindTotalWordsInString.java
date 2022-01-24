/*  Program 1 - WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
            Hi --> 2
            Hello --> 5		*/

package amruta.Assignment_24;

class FindTotalWordsInString{
	
	void findwords(String str){
		
		String[] op = str.split(" ");
		System.out.println("Length of array is : "+op.length);
		
		for(int index = 0; index < op.length; index++){
			
			System.out.println("word is :" + op[index] + " ----> " + op[index].length());
		}
	}
	
	public static void main(String[] args){
		String input = "Hi Hello";
		new FindTotalWordsInString().findwords(input);
	}
}