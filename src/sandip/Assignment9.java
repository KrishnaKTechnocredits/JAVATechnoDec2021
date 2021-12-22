package sandip;

public class Assignment9 {
	int maggie = 50;
	int dosa = 43;
	int pouches = 39;
	int panipuri = 43;
	int masala = 73;

	void purchaseItem(int maggierequest, int dosarequest, int pouchesrequest, int panipurirequest, int masalarequest) {
		if (maggierequest <= maggie) {
			maggie = maggie - maggierequest;
		} else {
			System.out.println("Insufficient request of maggie");
		}
		if (dosarequest <= dosa) {
			dosa = dosa - dosarequest;
		} else {
			System.out.println("Insufficient request of dosa");
		}
		if (pouchesrequest <= pouches) {
			pouches = pouches - pouchesrequest;
		} else {
			System.out.println("Insufficient request of pouches");
		}
		if (panipurirequest <= panipuri) {
			panipuri = panipuri - panipurirequest;
		} else {
			System.out.println("Insufficient request of panipuri");
		}
		if (masalarequest <= masala) {
			masala = masala - masalarequest;
		} else {
			System.out.println("Insufficient request of masala");
		}

	}

	void outOfStock() {
		if (maggie == 0)
			System.out.println("Maggie out of stock");
		if (dosa == 0)
			System.out.println("Dosa out of stock");
		if (pouches == 0)
			System.out.println("Pouches out of stock");
		if (panipuri == 0)
			System.out.println("Panipuri out of stock");
		if (masala == 0)
			System.out.println("Masala out of stock");
	}

	void availableStock() {
		if (maggie > 0)
			System.out.println("Maggie in stock : " + maggie);
		if (dosa > 0)
			System.out.println("Dosa in stock : " + dosa);
		if (pouches > 0)
			System.out.println("Pouches in stock : " + pouches);
		if (panipuri > 0)
			System.out.println("Panipuri in stock : " + panipuri);
		if (masala > 0)
			System.out.println("Masala in stock : " + masala);
	}

	public static void main(String[] args) {
		Assignment9 customer_1 = new Assignment9();
		customer_1.purchaseItem(10, 43, 50, 15, 40);
		System.out.println();
		customer_1.outOfStock();
		System.out.println();
		customer_1.availableStock();
	}
}
