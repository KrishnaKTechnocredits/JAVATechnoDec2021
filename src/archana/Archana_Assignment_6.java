package archana;
class Archana_Assignment_6{
	void stringLength(String name){
		System.out.println("Print String characters :" );
		for(int index =0;index < name.length() ; index++ ){
		    System.out.println(name.charAt(index));
		}
		System.out.println("-----------------------------------------------------------");
	}
		void reverse(String name){
			System.out.println("Print Reverse character of the string :");
		for(int index = name.length() -1;index >=0 ; index-- ){
		    System.out.println(name.charAt(index));
		}
		System.out.println("-----------------------------------------------------------");
	}
	
	void findChar(String name , char ch){
		System.out.println("Find character from string : ");
		for (int index =0;index < name.length() ; index++ ){
			if(name.charAt(index)==ch){
		        System.out.println(name.charAt(index) +"--"+index);
			}
		}
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void main(String[]args){
		Archana_Assignment_6 ass6 = new Archana_Assignment_6();
		ass6.stringLength("archana");
		ass6.reverse("technocredits");
		ass6.findChar("archana",'a');
	}
}