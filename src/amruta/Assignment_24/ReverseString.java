/* Program 4 - WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"
*/

package amruta.Assignment_24;

class ReverseString{
	//1st Logic
	String reverseString(String str){
		String temp = "";
		for(int index = str.length()-1; index >= 0; index--){
			temp = temp + str.charAt(index);
		}
		return temp;
	}
	
	String[] takeString(String str){
		
		String[] arr = str.split(" ");
		int count = 0;
		
		for(int index = 0; index < arr.length; index++){
			arr[count] = reverseString(arr[index]); 
			count++;			
		}
		return arr;
	}
	
	//2nd Logic
	void printStringInReverse(String str){
		
		String[] arr = str.split(" ");
		String revstr = "";
		
		for(int index = 0; index < arr.length; index++){
			revstr = revstr + " "+ reverseString(arr[index]); 
		}
		System.out.println("\nReverse String : "+revstr);
	}
	

	public static void main(String[] args){
		
		String str = "Hi techno hello";
		
		ReverseString reversestring = new ReverseString();
		
		String[] op = reversestring.takeString(str);
		
		System.out.println("String after reversing each word on the same index : ");
		
		for(int index = 0; index < op.length; index++){
			System.out.print(op[index]+" ");
		}
		System.out.print("\n");
		reversestring.printStringInReverse(str);
	}
}