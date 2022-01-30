package abhishek;
class Test4_Prog2 {

	String wordWithPrimeNum(String input) {
		String[] tempString = input.split(" ");
		String retrunString= "";
		for(int index=0; index< tempString.length; index++) {
			int n= tempString[index].length();
			boolean isPrime = true;
			if(n==2 || n==3) {
				retrunString+=" "+tempString[index];	
			}
			else if(n >3) {
				for(int innerIndex=2; innerIndex<= n/2; innerIndex++) {
					if(n%innerIndex == 0) {
						isPrime =false;
						break;
					}
					if(isPrime == true)
						retrunString+=" "+tempString[index];
				}
			}
		}
		return retrunString.trim();
	}

	public static void main(String[] args) {
		String input1= "I love My India";
		String input2= "I would like to have a cup of tea";
		Test4_Prog2 test4_prog2 = new Test4_Prog2();
		System.out.println(test4_prog2.wordWithPrimeNum(input1));
		System.out.println(test4_prog2.wordWithPrimeNum(input2));
	}
}