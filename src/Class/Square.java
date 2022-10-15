package Class;

public class Square {

	private double size_Side;

	public Square(double size_Side) {
		super();
		this.size_Side = size_Side;
	}

	public double getSize_Side() {
		return size_Side;
	}

	public void setSize_Side(double size_Side) {
		this.size_Side = size_Side;
	}

	public void changeSide(Double side) {

		this.size_Side = side;

		System.out.printf("Lado mudado para: %2.2f\n", this.size_Side);

	}

	public double showSide() {

		return size_Side;
	}
	
	public void calcArea() {
		
		double area = size_Side*size_Side;
		
		System.out.printf("Área: %2.2f\n",area);
		
	}
}
