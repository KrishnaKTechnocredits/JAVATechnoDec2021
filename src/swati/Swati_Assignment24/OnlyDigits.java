package swati.Swati_Assignment24;

public class OnlyDigits {

	public static void main(String[] args) {
	OnlyDigits o=new OnlyDigits();
	String str="Te1c2h C94re3";
	String [] arr= str.split(" ");
	for(int i=0;i<arr.length;i++) {
		String temp="";
		for(int j=0;j<arr[i].length();j++) {
			char c= arr[i].charAt(j);
			if(Character.isDigit(c)) {
				temp=temp+c;
			}			
		}
		System.out.println(temp);
	}

	}

}
