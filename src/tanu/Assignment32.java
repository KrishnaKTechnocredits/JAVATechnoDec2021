package tanu;
//import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;
class Assignment32{
	void addArrayAsList(String [] input1 ,String [] input2) {
		List<String> list1=Arrays.asList(input1);
		List<String> list2=Arrays.asList(input2);
		ArrayList<String>L1=new ArrayList<String>(list1);
		L1.addAll(list2);
		System.out.println(L1);
		/*Addingmethod*/
	}
	void printUniqueName(String[] userinput) {
		List<String>strname=Arrays.asList(userinput);
		ArrayList<String>output=new ArrayList<String>();
		for(int index=0; index<strname.size(); index++) {
			if(strname.indexOf(strname.get(index))==strname.lastIndexOf(strname.get(index))) {
				output.add(strname.get(index));
			}
		}
		System.out.println(output);
	}
		/*same program by using HashSet*/
	void removeALLTheOccurenceOfName(String[] name, String[]removeName) {
		ArrayList<String>output =new ArrayList<String>(Arrays.asList(name));
		//System.out.println(output);
		
		ArrayList<String>rl = new ArrayList<String>(Arrays.asList(removeName));
		//System.out.println(rl);
		 output.removeAll(rl);
			System.out.println(output);
	}
	/*same program by using HashSet*/
	void removeAllOccurrenceOfNameByUsingLinkedHashset(String [] ArrayNames) {
		LinkedHashSet<String> output =new LinkedHashSet<String>(Arrays.asList(ArrayNames));
		
		System.out.println(output);
		
		}
public static void main(String[] arg){
	
	Assignment32 assignment=new Assignment32();
	String [] input1= {"Anvit", "Sandip", "Nishika"};
	String [] input2= {"Priya", "Sandip", "Priya"};
	assignment.addArrayAsList(input1, input2);
	String[] name = {"Ravi", "Tanu", "Nishika", "Riya", "Sandip", "Priya"};
	String[] removeName={"Anvit", "Sandip", "Aavi", "Tanu", "Priya"};
	assignment.removeALLTheOccurenceOfName(name,removeName);
	String [] ArrayNames = {"Anvit", "Sandip", "Nishika", "Priya", "Sandip", "Priya"};
	assignment.removeAllOccurrenceOfNameByUsingLinkedHashset(ArrayNames);
	
}
	
}