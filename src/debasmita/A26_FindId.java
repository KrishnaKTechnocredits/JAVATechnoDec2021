package debasmita;

public class A26_FindId {
	
	void findIdFromURL(String input) {
		String[] ans=input.split("id=");
		for(int index=0;index<ans.length;index++) {
			String temp=ans[index];
			char ch=temp.charAt(index);
			if(Character.isDigit(ch)) 
				System.out.println(temp);
		}
	}
		
	
    public static void main(String[] args) {
    	A26_FindId findid=new A26_FindId();
    	findid.findIdFromURL("https://automationbykrishna.com/name=techno/id=123");
    }
}
