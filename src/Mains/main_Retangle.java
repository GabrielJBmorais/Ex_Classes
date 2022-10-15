package Mains;

import java.util.Scanner;

import Class.Retangle;

public class main_Retangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sideA;
		double sideB;
		
		System.out.println("Insira a medida da altura: ");
		sideA = sc.nextDouble();
		
		System.out.println("Insira a medida da base: ");
		sideB = sc.nextDouble();
		
		Retangle r = new Retangle(sideA, sideB);
		
		r.showSides();
		
		r.calcArea();
		
		r.calcPerim();
		
		
		sc.close();

	}

}
