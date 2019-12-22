package SeleniumAutomation;

public class Array {

	public static void main(String[] args) {

		int[] number = new int[5];
		int[] number1 = new int[10];

		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;

		number1[0] = 100;
		number1[1] = 200;
		number1[2] = 300;
		number1[3] = 400;
		number1[4] = 500;
		number1[5] = 600;
		number1[6] = 700;
		number1[7] = 800;
		number1[8] = 900;
		number1[9] = 1000;


		System.out.println(number[3] + "\n");
		System.out.println(number1[9] + "\n");

		int len = number.length;
		System.out.println("Arry size for number: " + len + "\n");
		int sum = number[3] + number1[4] + number[4] + number1[9];

		int len1 = number1.length;
		System.out.println("Arry size for number1: " + len1 + "\n");
	    int sum1 =number1 [3] + number1[4] + number1 [0];
		
		System.out.println("The total amout for number is: " +sum + "\n");
		System.out.println("The total number for number1 is: "+sum1 + "\n");
	}

}
