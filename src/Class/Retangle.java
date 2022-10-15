package Class;

public class Retangle {
	
	private double sideA;
	
	private double sideB;

	public Retangle(double sideA, double sideB) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	public void showSides() {
		
		System.out.printf("Altura: %2.2f\n",sideA);
		System.out.printf("Base: %2.2f\n",sideB);
		
	}
	
	public void changeSide(double sideA, double sideB) {
		
		this.sideA = sideA;
		this.sideB = sideB;
		
		System.out.println("Lados alterados para: "+this.sideA+" e "+this.sideB);
	}
	
	public void calcArea() {
		
		double area = sideA*sideB/2;

		System.out.printf("Área: %2.2f\n",area);
	}
	
	public void calcPerim() {
		
		double perimeter = (sideA*2)+(sideB*2);
		
		System.out.printf("Perimetro: %2.2f\n", perimeter);
		
	}
	
	
	
}
