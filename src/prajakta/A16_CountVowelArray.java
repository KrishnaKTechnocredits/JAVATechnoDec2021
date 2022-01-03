package prajakta;

public class A16_CountVowelArray {

	    int findVowelCountInString(String input) {
	    	     int cnt =0;
	    	     for(int index=0; index<input.length(); index++) {
	    	    	     char ch = input.charAt(index);
	    	    	     if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' ||ch == 'U' || ch == 'u')
	    	    	    	     cnt++;
	    	     }
	    	     System.out.println(input +" => "+ cnt);
	    	     return cnt;
	    }
	    
	    void findCountOfVowelsInStringArray(String[] arr) {
	    	     int count=0;
	    	     for(int index=0; index<arr.length; index++) {
	    	    	     count = count + findVowelCountInString(arr[index]);
	    	     }
	    	     
	    	     System.out.println("Total vowels ->"+count);
	    }
	    
	    public static void main(String[] a) {
	    	    A16_CountVowelArray a16_CountVowelArray = new A16_CountVowelArray();
	    	    String[] arr = {"priyanka", "swati", "acharya", "hevin", "KAUSTUKI"};
	    	    a16_CountVowelArray.findCountOfVowelsInStringArray(arr);
	    }
}
