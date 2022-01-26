package kavleen;

public class A17_StringVowels {
	
	void returnVowels(String [] arr) {
		int cnt = 0;
		String name= " ";
		for (int index=0;index<arr.length;index++) {
			String vowelName = arr[index];
			int count = 0;
			
		    for(int index1=0;index1<vowelName.length();index1++) {
		    	if(vowelName.charAt(index1)=='a' || vowelName.charAt(index1)=='e' || vowelName.charAt(index1)=='i' || vowelName.charAt(index1)=='o' || vowelName.charAt(index1)=='u')
		    		count++;
		    }
		     System.out.println("Total count of vowels in " + vowelName + " is " + count );
		   
		    if(count>cnt){
				cnt=count;
				name=vowelName;
			}
		}
		System.out.println("Name having maximum count of vowels is  : " + name);
	}
	
	public static void main(String[] args) {
		A17_StringVowels vowels = new A17_StringVowels();
		String [] arr =  {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
		vowels.returnVowels(arr);
	}

}
