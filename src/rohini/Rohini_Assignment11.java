package rohini;
/*Assignment - 11 : 24rd Dec'2021

Write a program with following methods.

1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string. 
*/

public class Rohini_Assignment11 {
    boolean flag=false;
	int totalcount =0;
	public void FindFirstOccurence(String str) {
		
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)=='a') {
				System.out.println("First occurence of a is: " + index);
				flag=true;
				break;
				
				}	
		}
		
	}
	
	public void FindLastOccurence(String str) {
		int lastindex=-1;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)=='a') {
				totalcount++;
				lastindex=index;
				
				}
			
		}System.out.println("Last occurence of a is: " + lastindex);
		
	}
	
	public boolean IsCharavailable() {
		if(flag==true)
			System.out.println("char a is available");
		return flag;
	}
	
	public void TotalOccurence() {
		System.out.println("Total count of a is : " + totalcount);
	}
	
	
	public static void main(String[] args) {
		Rohini_Assignment11 firststOcc = new Rohini_Assignment11();
		firststOcc.FindFirstOccurence("Mayank");
		firststOcc.FindLastOccurence("Mayank");
        boolean flag=firststOcc.IsCharavailable();
        System.out.println("Char is present as flag is "+ flag);
    	firststOcc.TotalOccurence();

	}
}

