public class Plats {
	
	private String plat;
	private double prix;
	
	public Plats (String plat, double prix) {
		
		this.plat = plat;
		this.prix = prix;
		
	}
	
	public double getPrix () {
		
		return this.prix;
		
	}
	public String getPlat () {
		
		return this.plat;
		
	}
	
}