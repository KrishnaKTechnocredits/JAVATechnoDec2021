package shital;

public class A24_PrintEachWordWithItsLength {

	void findTotalWordInString(String name) {
		String[] arr=name.split(" ");
		for(int index=0;index<arr.length;index++) {
			int wordLength=arr[index].length();
			System.out.println("word is :" + arr[index] + " -- " + wordLength);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_PrintEachWordWithItsLength printEachWordWithItsLength=new A24_PrintEachWordWithItsLength();
		printEachWordWithItsLength.findTotalWordInString("Hi Hello");
	}

}
