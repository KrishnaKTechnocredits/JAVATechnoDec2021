package kavleen;

public class Assignment16 {
	int count = 0 ;
	void countVowels(String arr){
	     int cnt=0 ;
		for(int index = 0 ; index<arr.length();index++){
			if(arr.charAt(index)=='a' || arr.charAt(index)=='e' || arr.charAt(index)=='i' || arr.charAt(index)=='o' || arr.charAt(index)=='u') {
				count++ ; 
				cnt++;
			}
		}
		System.out.println( arr + "-->" + cnt);
	}
	
	void totalVowels(String[] arr){
		for (int index=0 ; index<arr.length;index++){
		  countVowels(arr[index]);
	   }
	   System.out.println("Total vowel count is " + count);
	}
	public static void main (String [] args){
		Assignment16 assignment16 = new Assignment16();
		String[] arr = {"priyanka", "swati", "acharya", "hevin" };
		assignment16.totalVowels(arr);
	}
}
