import java.io.*;
import java.util.*;
public class PlanetWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		System.out.print ("What is your weight on Earth? ");
		double w = kbReader.nextDouble();
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos\n");
		System.out.println("Selection? ");
		int choice = kbReader.nextInt();
		switch (choice)
		{
		case 1:
		System.out.println ("Your weight on Voltar would be " + (w * 0.091));
		break;
		case 2:
		System.out.println("Your weight on Krypton would be " + (w * 0.720));
		break;
		case 3:
		System.out.println("Your weight on Fertos would be " + (w * 0.865));
		break;
		case 4:
		System.out.println("Your weight on Servontos would be " + (w * 4.612));
		break;
		}
	}

}
