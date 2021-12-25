package prajakta;

public class A11_ReturnType {
       int firstOccurance(String input, char ch) {
    	        for(int index=0; index<input.length();index++) {
    	        	    int output=0;
    	        	    if(input.charAt(index)==ch) {
    	        	    	     output=index;
    	        	    	     System.out.println("First Occurance of Character "+ch+" is " +output);
    	        	    	     return output;	
    	        }
    	        }
    	                 return -1;
       }
       
       int lastOccurance(String input, char ch) {
    	       for(int index=input.length()-1; index<=input.length();index--) {
    	    	       int output=0;
    	    	       if(input.charAt(index)==ch) {
    	    	    	        output=index;
    	    	    	        System.out.println("Last Occurance of Character "+ch+" is" +output);
    	    	    	        return output;
    	    	}
    	        }
    	               return -1;
       }
       
       boolean trueOutput(String input, char ch) {
    	        boolean flag = false;
    	        for(int index =0; index<input.length();index++) {
    	        	    if(input.charAt(index)==ch) {
    	        	    	     flag=true;
    	        	    	     return flag;
    	        }
    	        }
    	                return flag;
       }
       
       int totalOccurance(String input, char ch) {
    	        int count=0;
    	        for(int index=0; index<input.length(); index++) {
    	        	    if(input.charAt(index)==ch) {
    	        	    	     count++;
    	        }
    	        }
    	                 return count;
       }
       
       public static void main(String[]args) {
    	      A11_ReturnType returnoccurance = new A11_ReturnType();
    	      returnoccurance.firstOccurance("Prajakta",'a');
    	      returnoccurance.lastOccurance("Prajakta", 'a');
    	      boolean output1=returnoccurance.trueOutput("Prajakat", 't');
    	      if(output1==true)
    	    	      System.out.println("Character a found" + output1);
    	      else
    	    	      System.out.println("Character a not found" + output1);
    	      int output2=returnoccurance.totalOccurance("Prajakta", 'a');
    	      System.out.println("Total Occurance of Character a is " +output2);
       }
}
