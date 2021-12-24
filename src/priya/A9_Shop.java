package priya;

public class A9_Shop {
	int maggi=50;
	int dosa=43;
	int pouch =39;
	int panipuri=43;
	int masala=73;
	
	void purchase(int p1,int p2, int p3,int p4,int p5 ) {
		if(p1<=maggi)
			maggi=maggi-p1;
		else
			System.out.println("You have insufficient Quantity of maggi");
		
		if(p2<=dosa)
			dosa=dosa-p2;
		else
			System.out.println("You have insufficient Quantity dosa.");
	
		if(p3<=pouch)
			pouch=pouch-p3;
		else
			System.out.println("You have insufficient Quantity of pouch.");
		
		if(p4<=panipuri)
			panipuri=panipuri-p4;
		else
			System.out.println("You have insufficient Quantity of panipuri.");
		
		if(p5<=masala)
			masala=masala-p5;
		else
			System.out.println("You have insufficient Quantity of masala.");		
	}
	
	void soldout() {
		if(maggi==0)
			System.out.println("Maggi is sold out.");
		
		if(dosa==0)
			System.out.println("dosa is sold out.");
		
		if(pouch==0)
			System.out.println("pouch is sold out.");
		
		if(panipuri==0)
			System.out.println("panipuri is sold out.");
		
		if(masala==0)
			System.out.println("masala is sold out.");
	}
	
	void Available() {
		if(maggi>0)
			System.out.println(+maggi+ " quanitity of maggi available in stock");
		
		if(dosa>0)
			System.out.println(+dosa+ " quanitity of dosa available in stock");
		
		if(pouch>0)
			System.out.println(+pouch+ " quanitity of pouch available in stock");
		
		if(panipuri>0)
			System.out.println(+panipuri+ " quanitity of panipuri available in stock");
		
		if(masala>0)
			System.out.println(+masala+ " quanitity of masala available in stock");			
	}
	
	public static void main(String[] args) {
		A9_Shop s1=new A9_Shop();
		s1.purchase(50, 10, 10, 50, 10);
		s1.soldout();
		s1.Available();
		
	}

}
