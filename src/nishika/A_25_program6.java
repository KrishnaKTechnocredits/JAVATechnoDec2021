package nishika;
		/*Program 6. WAP to reverse each word and convert first letter of each word into capital 
//		 * Input    : "Vrushali Sagar Shital" 
		 * Output : "IlahsurV Ragas LatihS" 
		 */
public class A_25_program6 {
	
	String reverseWordFirstCapital(String name) {
		
		String temp="";
		
		for(int i=name.length()-1; i>=0 ; i--) {
			temp+=name.charAt(i);
		}
		temp = Character.toUpperCase(temp.charAt(0))+ temp.substring(1);
		return temp;
	}
	
	String findAllWord(String name) {
		
		String[] arr = name.split(" ");
		String output = "";
		
		for(int index=0 ; index<arr.length; index++) {
			output= output+" "+reverseWordFirstCapital(arr[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		A_25_program6 a_25_program6 = new A_25_program6();
		String a= a_25_program6.findAllWord("VrushAli Sagar Shital ");
		System.out.println(a);
	}
}
