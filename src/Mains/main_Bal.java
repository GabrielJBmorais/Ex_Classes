package Mains;

import java.util.Scanner;

import Class.Bal;

public class main_Bal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String color;
		String material;
		Double circun;
		
		System.out.println("Insira a cor: ");
		color = sc.nextLine();
		
		System.out.println("Material: ");
		material = sc.nextLine();
		
		System.out.println("Circunferência: ");
		circun = sc.nextDouble();
		
		Bal b1 = new Bal(color, material, circun);
		
		System.out.println(b1.showColor());
		
		System.out.println("Insira a cor para alterar: ");
		color = sc.nextLine();
		color = sc.nextLine();
				
		b1.changeColor(color);
		
		System.out.println(b1.showColor());
		
		sc.close();

	}

}
