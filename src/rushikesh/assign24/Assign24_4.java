package rushikesh.assign24;
//IMPORTANT
//Program 4. WAP to reverse each word on the same index
//Input    : "Hi techno hello"
//Output : "iH onhcet olleh"
public class Assign24_4 {
	String reverseString(String str) {
		String output = "";
		char ch;
		for (int index = str.length() - 1; index >= 0; index--) {
			ch = str.charAt(index);
			output += ch;
		}
		return output;
	}

	void getString(String input) {
		String[] arr = input.split(" ");
		String str = "";
		for (int index=0;index<arr.length;index++) {
			str = str + " " + reverseString(arr[index]);
		}
		System.out.println(str.trim());
	}
	
	public static void main(String[] args) {
		Assign24_4 assign24_4=new Assign24_4();
		String Input = "Hi techno hello";
		assign24_4.getString(Input);
		
	}
}
