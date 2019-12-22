package SeleniumAutomation;

public class JavaArray {

	public static void main(String[] args) {

		String[] names = { "Azad", "Adraham", "Nabil", "Nasif" };
		String[] cities = { "New York", "Bultimore", "Chicago" };
		String[] countryCode = { "US" };
		String[][] data = { names, cities, countryCode };
		int[] numbers = { 123, 345, 567, 8901, 7890 };

		System.out.println("Total number of data length is: " + numbers.length + "\n");

		System.out.println("The person name in the second box is: " + names[2] + "\n");

		System.out.println("The int number in the second box is: " + numbers[2] + "\n");

		System.out.println("The person name in the second box is: " + data[0][1] + "\n");

		for (int i = 0; i < data[1].length; i++) {
			System.out.println("The city name is: " +data[1][i]);
		}
	}

}
