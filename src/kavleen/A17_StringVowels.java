package kavleen;

public class A17_StringVowels {
	
	String returnVowels(String [] arr) {
		int vowelCount=0;
		int maxVowelCount=0;
		String maxVowelName="";
		for (int index=0;index<arr.length;index++) {
			String name = arr[index].toLowerCase();
			vowelCount = getVowelCount(name);	
			if (vowelCount>maxVowelCount) {
				maxVowelCount = vowelCount;
				maxVowelName = name ;				
			}
		}
		return maxVowelName;
		
	}
	 
	int getVowelCount(String name) {
		int vowelCount=0;
		for (int index1=0;index1<name.length();index1++) {
			if(name.charAt(index1)=='a'|| name.charAt(index1)=='e'|| name.charAt(index1)=='i' ||name.charAt(index1)=='o' || name.charAt(index1)=='u')
		    vowelCount++;
		}
		return vowelCount;
		
	}
	
	
	public static void main(String[] args) {
		A17_StringVowels vowels = new A17_StringVowels();
		String [] arr =  {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		String maxVowelCount = vowels.returnVowels(arr);
		vowels.returnVowels(arr);
	}

}
