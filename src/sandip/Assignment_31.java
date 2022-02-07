package sandip;

import java.util.ArrayList;
import java.util.List;

public class Assignment_31 {

	List<Integer> arrayList1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(8);
		list.add(0);
		list.add(8);
		list.add(60);
		list.add(56);
		list.add(97);
		list.add(0);
		list.add(33);
		list.add(66);
		list.add(0);
		System.out.println("Input : "+list);
		List<Integer> list1 = new ArrayList<Integer>();
		for(int index=0; index<list.size() ; index++) {
			if(list.indexOf(list.get(index))==list.lastIndexOf(list.get(index))) {
				list1.add(list.get(index));
			}else if(list.indexOf(list.get(index))!=list.lastIndexOf(list.get(index)) && list.indexOf(list.get(index))==index){
				list1.add(list.get(index));
			}
		}return list1;
	}
	
	List<String> arrayList2(){
		List<String> list = new ArrayList<String>();
		list.add("Techno");
		list.add("Credits");
		list.add("Techno");
		list.add("TechnoCredits");
		list.add("Credits");
		list.add("TechnoCredits");
		System.out.println("Input : "+list);
		List<String> list1 = new ArrayList<String>();
		for(int index=0; index<list.size() ; index++) {
			if(list.indexOf(list.get(index))==list.lastIndexOf(list.get(index))) {
				list1.add(list.get(index));
			}else if(list.indexOf(list.get(index))!=list.lastIndexOf(list.get(index)) && list.indexOf(list.get(index))==index){
				list1.add(list.get(index));
			}
		}return list1;
	}
	
	
	List arrayList3() {
		List list = new ArrayList();
		list.add("Techno");
		list.add(16);
		list.add("Credits");
		list.add(19);
		list.add("Techno");
		list.add(2);
		list.add(19);
		list.add("Credits");
		list.add(16);
		list.add("TechnoCredits");
		System.out.println("Input : "+list);
		List list1 = new ArrayList();
		for(int index=0; index<list.size() ; index++) {
			if(list.indexOf(list.get(index))==list.lastIndexOf(list.get(index))) {
				list1.add(list.get(index));
			}else if(list.indexOf(list.get(index))!=list.lastIndexOf(list.get(index)) && list.indexOf(list.get(index))==index){
				list1.add(list.get(index));
			}
		}return list1;
		
	}
	
	public static void main(String[] args) {
		Assignment_31 a1 = new Assignment_31();
		System.out.println();
		System.out.println(a1.arrayList1());
		System.out.println();
		System.out.println(a1.arrayList2());
		System.out.println();
		System.out.println(a1.arrayList3());
	}
}
