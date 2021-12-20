package sagarAcharya;

class A6_Assignment6{
	
	void display(String firstName){
		System.out.println("Display is : ");
			for(int index=0;index<firstName.length();index++)
				System.out.println(firstName.charAt(index));
	}
	
	void reverse(String secondName){
		System.out.println("Reverse is : ");
			for(int index = secondName.length()-1;index>=0;index--)
				System.out.println(secondName.charAt(index));
	}
	
	void charFeq(String freq , char n){
		System.out.println("Freq is : ");
			int num =0;
			for(int index = 0;index<freq.length();index++)
				if(freq.charAt(index) == n)
					num++;
				System.out.println("instance of e is :" + num);
	}
	
	public static void main(String[] args){
		A6_Assignment6 assignment6 = new A6_Assignment6();
		assignment6.display("Techno");
		assignment6.reverse("Techno");
		assignment6.charFeq("TechnoCredits",'e');
	}
}
