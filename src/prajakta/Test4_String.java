package prajakta;

public class Test4_String {

	String wordWithPrimeNumLength(String input) {
		String[] temp = input.split(" ");
		String retrunString= "";
		for(int index=0; index< temp.length; index++) {
			int n= temp[index].length();
			boolean isPrime = true;
			if(n==2 || n==3) {
				retrunString+=" "+temp[index];	
			}
			else if(n >3) {
				for(int innerIndex=2; innerIndex<= n/2; innerIndex++) {
					if(n%innerIndex == 0) {
						isPrime =false;
						break;
					}
					if(isPrime == true)
						retrunString+=" "+temp[index];
				}
			}
		}
		return retrunString.trim();
	}

	public static void main(String[] args) {
		String input1= "I love My India";
		String input2= "I would like to have a cup of tea";
		Test4_String test4_String = new Test4_String();
		System.out.println(test4_String.wordWithPrimeNumLength(input1));
		System.out.println(test4_String.wordWithPrimeNumLength(input2));
	}
}