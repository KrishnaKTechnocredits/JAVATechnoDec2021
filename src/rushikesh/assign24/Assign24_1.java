package rushikesh.assign24;

//1. WAP to find out total words in a given string & print each word with its length
//Input    : Hi Hello
//Output : Total 2 words
//              Hi --> 2
//              Hello --> 5
public class Assign24_1 {
	void findWords(String str) {
		String [] str1=str.split(" ");  
		for(int index=0;index<str1.length;index++) {
			String str2=str1[index];
			System.out.println(str2+"-->"+str2.length());
		}
	}
	public static void main(String[] args) {
		Assign24_1 assign24_1=new Assign24_1();
		assign24_1.findWords("Hi Hello");
	}
}
