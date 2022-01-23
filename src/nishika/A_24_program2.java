package nishika;
		 /* WAP to find our total vowels in each word from the given string 
		  * Input    : aashvi technocredits 
		  * Output : aashvi --> 3    
		  *  technocredits --> 4*/

public class A_24_program2 {
	
	void toFindNoOfVowelInString(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index) ;
			if (ch== 'a' || ch == 'e' || ch == 'i'||ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println(name + "=>" + count);
	}

	void covertStringToArray(String name) {
		String[] arr = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			toFindNoOfVowelInString(arr[index]);
		}
	}
	
	

	public static void main(String[] args) {
		A_24_program2 a_24_program2 = new A_24_program2();
		 a_24_program2.covertStringToArray("aashvi technocredits");

	}
	
}
