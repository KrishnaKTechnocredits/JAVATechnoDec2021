package prajakta;

public class A17_1_MaxVowels {

	    void findMaximumVowels(String[] input) {
	    	     String nameOfMaximumVowel = " ";
	    	     int cnt=0;
	    	     for(int index=0; index<input.length; index++) {
	    	    	     String temp = input[index];
	    	    	     int count = 0;
	    	    	     for(int innerIndex=0; innerIndex<temp.length(); innerIndex++) {
	    	    	    	 char ch = temp.charAt(innerIndex);
	    	    	    	     if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
	    	    	    	    	     count++;
	    	    	     }
	    	    	     System.out.println(temp+" has total count of Vowels"+count);
	    	    	             if(count>cnt) {
	    	    	             cnt=count;
	    	    	             nameOfMaximumVowel=temp;
	    	     }
	    	     }
	    	     System.out.println("..............................");
	    	     System.out.println("Name of Maximum count of vowel is "+nameOfMaximumVowel);
	    }
	    
	    public static void main(String[]args) {
	    	     A17_1_MaxVowels maxvowels = new A17_1_MaxVowels();
	    	     String[] name = {"hi","priyanka","sandip", "aakansha", "pallavi", "apurva"};
	    	     maxvowels.findMaximumVowels(name);
	    }
}
