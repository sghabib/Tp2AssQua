public class Commandes {
	
	private String client;
	private Plats plat;
	private int qty;
	
	public Commandes (String client, Plats plat, int qty) {
		
		this.client = client;
		this.plat = plat;
		this.qty = qty;
		
	}
	
	public int getQty () {
		
		return this.qty;
		
	}
	
	public String getClient () {
			
			return this.client;
			
	}
	
	public Plats getPlat () {
		
		return this.plat;
		
	}
	
}