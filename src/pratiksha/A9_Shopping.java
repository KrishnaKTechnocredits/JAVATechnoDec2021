package pratiksha;

public class A9_Shopping {
	
	
	int maggie = 50;
	int dosa= 43;
	int oilpouches = 39;
	int panipuri = 43;
	int masala = 73;
	
	public void purchaseItem(int mReq, int dReq, int oReq, int paReq, int maReq) {
		
		if (mReq<=maggie) {
			maggie = maggie-mReq;
			System.out.println("Shopper purchased " +mReq +" packets of maggie and available packets are" +maggie);
		}
		
		else {
			
			System.out.println("Insufficient packets of maggie");
		}
		
		if (dReq<= dosa) {
			dosa = dosa -dReq;
			System.out.println("Shopper purchased " +dReq +" packets of dosa aata and available packets are" +dosa);
		}
		
		else {
			
			System.out.println("Insufficient packets of dosa ");
		}
		
		if (oReq<= oilpouches) {
			oilpouches = oilpouches -oReq;
			System.out.println("Shopper purchased " +oReq +" packets of oil pouches and available packets are" +oilpouches);
		}
		
		else {
			
			System.out.println("Insufficient packets of oil pouches ");
		}
			
		if (paReq<= panipuri) {
			panipuri = panipuri -paReq;
			System.out.println("Shopper purchased " +paReq +" packets of panipuri packets and available packets are " +panipuri);
		}
		
		else {
			
			System.out.println("Insufficient packets of panipuri packets ");
		}
		
		if (maReq<= masala) {
			masala = masala -maReq;
			System.out.println("Shopper purchased " +maReq +" packets masala and available packets are " +masala);
		}
		
		else {
			
			System.out.println("Insufficient packets of masalas ");
		}
	}
	
	public void printOutOfStock() {
		
		if (maggie ==0)
			System.out.println("Maggie is out of Stock");
		if(dosa==0)
			System.out.println("Dosa is out of Stock");
		if(oilpouches == 0)
			System.out.println("Oil Pouches is out of Stock");
		if(panipuri == 0)
			System.out.println("Panipuri packets are out of Stock");
		if(masala == 0)
			System.out.println("Masala packets are out of stock");
	}
	
	public void AvailableStock() {
		
		if(maggie>0)
			System.out.println("Maggie is available");
		if(dosa>0)
			System.out.println("Dosa is available");
		if(panipuri>0)
			System.out.println("Panipuri packet is available");
		if(oilpouches>0)
			System.out.println("Oil pouches are available");
		if(masala>0)
			System.out.println("Masala is available");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A9_Shopping shop = new A9_Shopping();
		shop.purchaseItem(28, 50, 32, 47, 12);
		shop.printOutOfStock();
		shop.AvailableStock();
		shop.purchaseItem(34,45, 54, 23, 78);
		shop.printOutOfStock();
		shop.AvailableStock();

	}

}
