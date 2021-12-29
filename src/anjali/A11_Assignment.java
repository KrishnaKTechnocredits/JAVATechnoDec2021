/*Write a program with following methods.

1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string. */

package anjali;

public class A11_Assignment {

	
	int firstOccurrenceOfCharInString(String Name, char ch) {
		 int index;
		 for( index=0;index<Name.length();index++){
			 if(Name.charAt(index)==ch) {
				 System.out.println("The first occurence of "+ch+" charater in string "+Name +"is "+index);
			    break;
			 }
		 } 
		return index;
	 }
		
	 int lastOccurrenceOfCharInString(String Name, char ch) {
			int index;
			 for(index=Name.length()-1;index>=0;index--)
			 {
				 if(Name.charAt(index)==ch)
				 {
					 System.out.println("The last occurence of "+ch+" charater in string "+Name+"is "+index);
				   break;
				 }
			 } 
			return index;
		}
	 
	 boolean charFound(String Name, char ch){
		 int index;
		 boolean flag=false;
		 for( index=0;index<Name.length();index++){
			 if(Name.charAt(index)==ch)
				 System.out.println();
				 flag=true;
		}
		return flag;
		
	 }
	 
	int totalOccOfChar(String Name, char ch){
		 int index;
		 int count=0;
         for( index=0;index<Name.length();index++){
			 if(Name.charAt(index)==ch)
				count++;
		  }
		return count;
	 }
	 public static void main(String[] args) {
			A11_Assignment assignment11 = new A11_Assignment();
			assignment11.firstOccurrenceOfCharInString("Technocredit",'e');
			assignment11.lastOccurrenceOfCharInString("Technocredit",'e');
			boolean b=assignment11.charFound("Technocredit",'e');
			System.out.println(b);
			int sum=assignment11.totalOccOfChar("Technocredit",'e');
			System.out.println("The total occurnace of given char is :"+sum);
	}

}
