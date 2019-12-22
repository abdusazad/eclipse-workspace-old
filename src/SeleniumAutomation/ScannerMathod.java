package SeleniumAutomation;

import java.util.Scanner;

public class ScannerMathod {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter Seceond Numbe: ");

		int number2 = scanner.nextInt();

		System.out.print("Your Total Number is:" + (number1 + number2));

	}

}
