package SeleniumAutomation;

import java.util.Scanner;

public class IfElseIfStatementUTube {

	public static void main(String[] agrs) {

		System.out.println("Helloo!! Welcome to our Mobile market");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Cellphone phone name: ");
		String Cellphone = input.nextLine();

		if (Cellphone.equals("iphone")) {
			System.out.println("iphone price is: $1000.00");

		}
		else if (Cellphone.equals("samsung")) {
			System.out.println("Samsong prince is $950.00");

		}
		else if (Cellphone.equals("nokia")) {

			System.out.println("Nokia price is: $700.00");

		} else {
			System.out.println("Soryy! We dont carry that product in our Mobile market");

		}
	}

}
