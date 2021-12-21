/*Assignment - 6 : 18th Dec'21
1.Print characters in stringdemo
2.Print characters in string in reverse order
3.Print occurance of given charater in string
*/

package pallavi;

class A6_SringDemo{
	
	void displayChar(String name){
		
		for(int index=0; index<name.length();index++)
			System.out.println(name.charAt(index));
	}
	
	void displayRevrseChar(String name){
		
		for(int index=name.length()-1; index>=0;index--)
			System.out.println(name.charAt(index));
	}
	
	void findCharFreq(String name, char c){
		
		int count=0;
		for(int index=0; index<name.length();index++){
			if(name.charAt(index)==c)
			count++;
		}
		System.out.println("Input= "+name);
		System.out.println(c+ "->" +count);			
	}
	
	public static void main(String[] arr){
	
		A6_SringDemo stringdemo= new A6_SringDemo();
		stringdemo.displayChar("Arjun");
		System.out.println("");		
		stringdemo.displayRevrseChar("Arjun");
		System.out.println("");		
		stringdemo.findCharFreq("Pallavi",'l');
	}
}	