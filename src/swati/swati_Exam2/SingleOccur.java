package swati.swati_Exam2;

import java.util.ArrayList;

public class SingleOccur {	
	//int temp=0;
	
	//sagar code
	String temp="";
	boolean findSingle(int num,int i) {
		//int j=i+1;	
		String strNum=String.valueOf(num);
		boolean flag=false;
		int[] arr = {5,8,1,2,4,3,2,1};
		
		for(int j=0;j<=arr.length;j++) {
			if(temp.contains(strNum)) {
				flag=true;
				break;
			}
	//		System.out.println(arr[j]);
			if(num==arr[j]) {
				flag=true;
				break;
				
			}
			
			/*
			 * else { return true; }
			 */
			
		}
		temp=temp+String.valueOf(num);
		System.out.println(temp);
		return flag;
		
	}

	public static void main(String[] args) {
		SingleOccur oc = new SingleOccur();
		int[] num = {5,8,1,2,4,3,2,1};
		
		String uniques = "";
		String dupes = "";
		
		for(int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] == num[j]) {
					isUnique = false;				
					break;				
				}
			}
			String strNum=String.valueOf(num[i]);
			
			if(isUnique && !dupes.contains(strNum)) {
				uniques += num[i] + " ";
			}
			else {
				dupes += num[i] + " ";
			}
			//System.out.println(isUnique + " " + num[i] + " " + dupes.contains(strNum) + " " + dupes);
		}
		System.out.println(uniques);
		//System.out.println(oc.SingleOcc(num));
		/*
		 * for(int i=0;i<num.length;i++) { boolean flag=oc.findSingle(num[i],i);
		 * if(flag==false) { System.out.println(num[i]); } }
		 */

	}

}
