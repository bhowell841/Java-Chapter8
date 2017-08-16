import java.util.Scanner;

/*
 * Tester app for static methods
 */
public class MetricConverterTester {

	public static void main(String[] args) {
		// ask use for miles
		Scanner input = new Scanner( System.in );
		System.out.print("Enter miles");
		double userMiles = input.nextDouble();
		
		// no need to create an instance of MetricConverter since we are using static methods
		double kilos = MetricConverter.milesToKilometers(userMiles);
		System.out.println(userMiles + " miles converted to kilometers is " + kilos);

	}

}
