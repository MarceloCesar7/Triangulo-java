package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measurement of the triangle x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measurement of the triangle y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double Areax = x.area();
		double Areay = y.area();
		
		System.out.printf("Triangle area x: %.4f%n", Areax);
		System.out.printf("Triangle area y: %.4f%n", Areay);

		if (Areax > Areay) {
			System.out.printf("Larger area x");
		} else {
			System.out.printf("Larger area y");
		}

	}

}
