package prajakta;

public class A14_Contains {
	   void findStringBasedOnCondition(String input) {
		       int count1 = 0;
		       int count2 = 0;
		       String temp = "";
		       for(int index = 0; index < input.length(); index++) {
		    	       char ch = input.charAt(index);
		    	       String s = ch +""; //To make character as String we have given double quote comma
		    	       if(temp.contains(s)==false) {
		    	    	       if(input.indexOf(ch) != input.lastIndexOf(ch)) {
		    	    	    	       System.out.println("Duplicate Characters " +ch);
		    	    	    	       count1++;
		    	    	       }
		    	    	       else {
		    	    	System.out.println("Unique Characters " +ch);
		    	    	count2++;
		    	    	}
		    	}
		    	temp = temp+ch;       
		        }
		               System.out.println("Duplicate Character count is "+count1);
		                   System.out.println("Unique Character count is "+count2);
		                   if(count1>count2)
		                	       System.out.println("Please Print Java if Duplicate Character is greater than Unique Character");
		                   else
		                	       System.out.println("Please Print Selenium if Duplicate Character is less than Unique Character");
	   }
	   public static void main(String[] args) {
		      A14_Contains contains = new A14_Contains();
		      contains.findStringBasedOnCondition("prajakta");
	   }

}
