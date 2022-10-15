package Class;

public class Bal {

	private String color;
	private String material;
	private Double circun;
	
	public Bal(String color, String material, Double circun) {
		super();
		this.color = color;
		this.material = material;
		this.circun = circun;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getCircun() {
		return circun;
	}

	public void setCircun(Double circun) {
		this.circun = circun;
	}
	
	public void changeColor(String color) {
		this.color = color;
		
	}
	
	public String showColor() {
		
		return color;
	}
	
	
	
	
}
