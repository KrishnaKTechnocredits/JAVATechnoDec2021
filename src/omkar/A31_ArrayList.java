package omkar;
import java.util.ArrayList;
import java.util.Arrays;

public class A31_ArrayList {
	
	ArrayList findUinqueElements(ArrayList arlist) {
		ArrayList uniqueElement = new ArrayList();
		for(int index=0; index<arlist.size(); index++) {
			if(arlist.indexOf(arlist.get(index)) == arlist.lastIndexOf(arlist.get(index))) {
				uniqueElement.add(arlist.get(index));
			}else {
				if(!uniqueElement.contains(arlist.get(index))) {
					uniqueElement.add(arlist.get(index));					
				}
			}
		}
		return uniqueElement;
	}

	public static void main(String[] args) {
		A31_ArrayList exArrayList = new A31_ArrayList();
		ArrayList input = new ArrayList(Arrays.asList(19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0));
		System.out.println(exArrayList.findUinqueElements(input));
		ArrayList input1 = new ArrayList(Arrays.asList("Techno", "Credits", "Techno", "TechnoCredits", "Credits", "TechnoCredits"));
		System.out.println(exArrayList.findUinqueElements(input1));
		ArrayList input2 = new ArrayList(Arrays.asList("Techno", 16, "Credits", 19, "Techno", 2, 19, "Credits", 16, "TechnoCredits"));
		System.out.println(exArrayList.findUinqueElements(input2));
	}
}
