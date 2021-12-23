package prajakta;

class A8_Assignment {

      void displayEvenChar(String name) {
    	   System.out.print("The Even Characters in the String are :");
    	   for (int index = 0; index < name.length(); index++) {
    		     if ((index + 1) % 2 == 0) {
    		    	   char letter = name.charAt(index);
    		    	   System.out.print(letter);
    		    }
    	   }
      }
      
      void displayVowel(String name) {
    	   System.out.print("The Vowel Letter in the String are :");
    	   for (int index = 0; index < name.length(); index++) {
    		     char letter = name.charAt(index);
    		     if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'u')
    		          System.out.print(letter);	 
    	   }
      }
      
      public static void main(String[] args) {
    	    A8_Assignment A8_Assignment = new A8_Assignment();
    	    A8_Assignment.displayEvenChar("technocredits");
    	    System.out.println();
    	    A8_Assignment.displayVowel("technocredits");
      }
}
