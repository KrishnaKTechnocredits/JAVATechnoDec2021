package pradeep;

class A17_PrintTriplets {
	
	//Program 1: Print all triplets in which all 3 numbers are consecutive.
	void printConsecutiveTriplet(int[] arr) {
		for(int index=0; index<arr.length-2; index++) {
			if(arr[index+1]==arr[index] + 1 && arr[index+2]== arr[index] +2) {
				System.out.println(arr[index]+"-->"+arr[index+1]+"-->"+arr[index+2]);
			}
		}		
	}
	
	//Program 2: return String having maximum vowels from given array.
	String getMaxVowelString(String[] arr1) {
		int max=0;
		int maxIndex=0;
		
		for(int index=0; index<arr1.length; index++) {
			int countVowel=0;
			String str = arr1[index];
			for(int index1=0; index1<str.length(); index1++) {				
				if(str.charAt(index1)=='a' || str.charAt(index1)=='e' || str.charAt(index1)=='i' || str.charAt(index1)=='o' || str.charAt(index1)=='u' ) {
					countVowel++;
				}				
			}
			if(max<countVowel) {
				max=countVowel;
				maxIndex=index;
			}
		}
		String maxVowelString=arr1[maxIndex];
		return maxVowelString;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,13,14,15,16,19,20,22,23,24};
		String[] arr1 = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		
		A17_PrintTriplets a17_PrintTriplets = new A17_PrintTriplets();
		a17_PrintTriplets.printConsecutiveTriplet(arr);
		String maxVowelString = a17_PrintTriplets.getMaxVowelString(arr1);
		
		System.out.println("Maximum vowel String is:  " + maxVowelString);
	}
}
