package vishakha;

class A9_Shop {
		int maggie = 50;
		
		int dosa = 43;
		
		int oil = 39;
		
		int panipuri = 43;
		
		int masala = 73;
		
		void purchaseItem(int reqMaggie, int reqDosa, int reqOil, int reqPanipuri, int reqMasala) {
			if(maggie >= reqMaggie && reqMaggie > 0)
				maggie = maggie - reqMaggie;
			else
				System.out.println("Insufficient stock of Maggie");
			if(dosa >= reqDosa && reqDosa > 0)
				dosa = dosa - reqDosa;
			else
				System.out.println("Insufficient stock of Dosa");
			if(oil >= reqOil && reqOil > 0)
				oil = oil - reqOil;
			else
				System.out.println("Insufficient stock of Oil");
			if(panipuri >= reqPanipuri && reqPanipuri > 0)
				panipuri = panipuri - reqPanipuri;
			else
				System.out.println("Insufficient stock of panipuri");
			if(masala >= reqMasala && reqMasala > 0)
				masala = masala - reqMasala;
			else 
				System.out.println("Insufficient stock of masala");
		}
		
		void printOutOfStock() {
				boolean flag = true;
				if(maggie==0)
						System.out.println("Maggie packets are out of stock");
				if(dosa==0)
						System.out.println("Dosa packets are out of stock");
				if(oil==0)
						System.out.println("Oil packets are out of stock");
				if(panipuri==0)
						System.out.println("Panipuri packets are out of stock");
				if(masala==0)
						System.out.println("Masala packets are out of stock");
				if(flag==true)
						System.out.println("All items are out of stock");
		}
		
		void printAvailableStock() {
			if(maggie > 0)
					System.out.println("Available stock of Maggie is:" + maggie);
			if(dosa > 0)
					System.out.println("Available stock of Dosa is: " + dosa);
			if(oil > 0)
					System.out.println("Available stock of Oil is:" + oil);
			if(panipuri > 0)
					System.out.println("Available stock of panipuri is:" + panipuri);
			if(masala > 0)
					System.out.println("Available stock of masala is:" + masala);
		}
		
		public static void main(String[] args) {
			
			A9_Shop shop = new A9_Shop();
			shop.purchaseItem(5,6,8,9,10);
			shop.printAvailableStock();
			shop.printOutOfStock();
	}

}
