package shital;

import java.util.ArrayList;
import java.util.Arrays;

public class A31_ReturnUniqueElements {

	void printUniqueElement(ArrayList al) {
		System.out.println("Output is : ");
		ArrayList alist=new ArrayList();
		for(int index=0;index<al.size();index++) {
			for(int i=index;i<al.size();i++) {
				if(al.indexOf(al.get(index))==al.lastIndexOf(al.get(index))){
					if(!alist.contains(al.get(index))) {
						alist.add(al.get(index));
					}
				}
					else if(!alist.contains(al.get(index)))
						alist.add(al.get(index));
			}
		}
		System.out.println(alist);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A31_ReturnUniqueElements returnUniqueElements=new A31_ReturnUniqueElements();
		System.out.println("\n********** Only Integer ***************");
		ArrayList<Integer> element=new ArrayList<Integer>();
		element.add(19);
		element.add(8);
		element.add(0);
		element.add(8);
		element.add(60);
		element.add(56);
		element.add(97);
		element.add(0);
		element.add(33);
		element.add(60);
		element.add(0);
		System.out.println("Input is : "+element);
		returnUniqueElements.printUniqueElement(element);
		
		System.out.println("\n********** Only String ***************");
		String[] input ={"Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"};
		ArrayList<String> element2=new ArrayList<String>(Arrays.asList(input));
		System.out.println("Input is "+element2);
		returnUniqueElements.printUniqueElement(element2);
		
		System.out.println("\n**********String and Ineteger ***************");
		ArrayList al=new ArrayList();
		al.add("Techno");
		al.add(16);
		al.add("Credits");
		al.add(2);
		al.add(19);
		al.add("Credits");
		al.add(16);
		al.add("TechnoCredits");
		System.out.println("Input is :"+al);
		returnUniqueElements.printUniqueElement(al);	
	}
}
