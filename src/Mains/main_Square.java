package Mains;

import java.util.Scanner;

import Class.Square;

public class main_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double side;
		
		System.out.println("Insira o valor dos lados: ");
		side = sc.nextDouble();
		
		Square s = new Square(side);
		
		System.out.println(s.showSide());
		
		System.out.println("Medida nova: ");
		side = sc.nextDouble();
		
		s.changeSide(side);
		
		s.calcArea();
		
		
		sc.close();

	}

}
