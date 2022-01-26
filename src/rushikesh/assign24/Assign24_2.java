package rushikesh.assign24;
//Program 2. WAP to find our total vowels in each word from the given string
//Input    : aashvi technocredits
//Output : aashvi --> 3
//              technocredits --> 4
public class Assign24_2 {
	void findWords(String str) {
		
		String [] str1=str.split(" ");  
		for(int index1=0;index1<str1.length;index1++) {
			int count=0;
			String str2=str1[index1];
			char [] arr=str2.toCharArray();
			for(int index2=0;index2<arr.length;index2++) {
				char ch=arr[index2];
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
					count++;
				}
			}
			System.out.println(str1[index1]+"-->"+count);
		}
	}
	public static void main(String[] args) {
		Assign24_2 assign24_2=new Assign24_2();
		assign24_2.findWords("aashvi technocredits");
	}
}
