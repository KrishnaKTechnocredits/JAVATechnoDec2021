package ashish;

public class A15_NameWithMaxLengthFromArray {

	String nameWithMaxLength(String arr[]) {
		String maxLengthName = "";
		int maxLength = arr[0].length();
		for(int i = 1; i<arr.length; i++) {
			if(maxLength < arr[i].length())
				maxLengthName = arr[i];
		}
		return maxLengthName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15_NameWithMaxLengthFromArray nameWithMaxLength = new A15_NameWithMaxLengthFromArray();
		String arr[] = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		System.out.println(" Name with max length from array {Karan, Shweta, Pallavi, Abhishek, Sagar} is " + nameWithMaxLength.nameWithMaxLength(arr));
	}	
}
