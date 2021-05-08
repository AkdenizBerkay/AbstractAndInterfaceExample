package Game.entities;

public class Campaign {
	private int id;
	private String name;
	private double discount;
	private String description;
	public Campaign(int id, String name,double discount,String description) {
		super();
		this.id = id;
		this.name = name;
		this.description=description;
		this.discount=discount;
	}
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
