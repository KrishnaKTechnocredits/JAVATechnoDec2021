package priyankaZende;
class NestedIfElseDemo{
	void displayGrade(int score){
		if(score > 40){
			if(score > 40 && score <=50)
				System.out.println("D");
			else if(score > 50 && score <= 60)
				System.out.println("C");
			else if(score >60 && score <= 70)
				System.out.println("B");
			else if(score >70)
				System.out.println("A");
			else
				System.out.println("Invalid Score");
		}
		else if(score <= 40 && score >=0)
				System.out.println("Failed");
			else
				System.out.println("Invalid Score");			
	}
	
	public static void main(String[] args){
		NestedIfElseDemo nestedIfElse = new NestedIfElseDemo();
		nestedIfElse.displayGrade(168);
		nestedIfElse.displayGrade(-168);
		nestedIfElse.displayGrade(0);
		nestedIfElse.displayGrade(67);
		nestedIfElse.displayGrade(+69);
		nestedIfElse.displayGrade(55);
	}	
}		
