package classesWithAttribute;

public class Product {

	public Product(int id, String name, String description, int stockAmount, String renk, String kod, double prime) {
		System.out.println("Yapıcı blok çalıştı");

		this.description = description;
		this.id = id;
		this.kod = kod;
		this.name = name;
		this.prime = prime;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}

	public Product() {

	}

	// attribute veya field
	private int id;
	private String name;
	private String description;
	private double prime;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
