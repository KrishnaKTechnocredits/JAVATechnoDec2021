/*WAP to reverse each word on the same index
 Input=>Hi Techno hello
 Output=>iH onhceT olleh  
 */
package anjali.Assignment24;

public class A24_Program4 {
	
	String reverseString(String name){
		String temp="";
		for(int index=name.length()-1;index>=0;index--){
			temp=temp+name.charAt(index);
		}
		return temp;
	}
	
	String reverseEachWordInString(String name){
		String temp1="";
		String[] arr=name.split(" ");
		for(int index=0;index<arr.length;index++){
			temp1=temp1+" "+reverseString(arr[index]);
		}
	 	return temp1.trim();
	}
	
	public static void main(String[] args) {
		A24_Program4 a24_Program4 = new A24_Program4();
		String output=a24_Program4.reverseEachWordInString("Hi Techno hello");
		System.out.println(output);
	}

}
