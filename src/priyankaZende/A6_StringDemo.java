/*Assignment - 6 : 18th Dec'21
1.Print characters in stringdemo
2.Print characters in string in reverse order
3.Print occurance of given charater in string
*/

package priyankaZende;
class A6_StringDemo{
	void printAllCharsFromString(String name){
		System.out.println("Print all chars from string:" + "\n");
		for(int index=0;index < name.length();index++){
			System.out.print(name.charAt(index) + "\t" + (index+1));
		}
		System.out.println();
	}
	
	void reverseString(String name){
		System.out.println("Print reverse string:" + "\n");
		for(int index=name.length()-1; index >= 0; index--){
			System.out.print(name.charAt(index) + "\t");
		}
	}

	public static void main(String[] args){
		A6_StringDemo stringDemo = new A6_StringDemo();
		stringDemo.printAllCharsFromString("Technocredits");
		stringDemo.reverseString("Technocredits");
	}
}	
	