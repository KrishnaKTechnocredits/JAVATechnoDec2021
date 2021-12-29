package debasmita;

public class A11_FrequencyOfCharacters {
	 int firstOccurence(String input, char ch){
			int index=0;
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i)==ch) {
					index=i;
					break;
				}
			}
			    return index;
	    }
	    int lastOccurence(String input, char ch){
			int index=0;
			for(int i=input.length() -1; i>1; i--) {
				if(input.charAt(i)==ch) {
					index=i;
					break;
				}
			}
			    return index;
	    }
	    boolean characterFound(String input,char ch) {
	    	boolean flag=false;
	    	for(int i=0; i<input.length(); i++) {
				if(input.charAt(i)==ch) {
					flag=true;
				}
	    	}
	    	        return flag;
	    }
	    int totalOccurence(String input, char ch){
			int count=0;
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i)==ch) {
					count++;
			     }
			}
			    return count;
	    }
	    
		public static void main(String[] args) {
			A11_FrequencyOfCharacters f1 = new A11_FrequencyOfCharacters();
			int temp= f1.firstOccurence("Debasmita", 'e');
			System.out.println("first occurence of given character is at "+temp);
			int temp1=f1.lastOccurence("Debasmita", 's');
			System.out.println("last occurence of given character is at "+temp1);
			boolean temp2=f1.characterFound("Debasmita", 'p');
			System.out.println("character found  "+temp2);
			int temp3=f1.totalOccurence("Debasmita", 'a');
			System.out.println("total frequency of given character is "+temp3);
		}
}


