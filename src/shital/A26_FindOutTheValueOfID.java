package shital;

public class A26_FindOutTheValueOfID {

	void findIDFromURL(String str) {
		String[] arr=str.split("id=");
		System.out.println("Input is :"+str);
		System.out.println("\n"+arr[0]);
		System.out.println(arr[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A26_FindOutTheValueOfID findOutTheValueOfID=new A26_FindOutTheValueOfID();
		String str="https://automationbykrishna.com/name=techno/id=123";
		findOutTheValueOfID.findIDFromURL(str);
	}

}
