import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * The will test the Area class
 * 
 */
public class AreaTester {

	public static void main(String[] args) {
	
		
		//  instance of scanner
		Scanner input = new Scanner(System.in);
		
		//  calculate the area of a circle
		System.out.println("Enter the radius of the circle: ");
		double radius = input.nextDouble();
		System.out.printf("The area of the circle is %.2f units squared.\n", Area.getArea(radius));
		
		//  calculate the area of a rectangle
		System.out.println("Enter the length of the rectangle: ");
		int length = input.nextInt();
		System.out.println("Enter the width of the rectangle: ");
		int width = input.nextInt();
		System.out.printf("The area of the rectangle is %.2f units squared.\n", Area.getArea(length, width));
		
		//  calculate the area of a cylinder
		System.out.println("Enter the radius of the cylinder: ");
		radius = input.nextDouble();
		System.out.println("Enter the height of the cylinder: ");
		double height = input.nextDouble();
		System.out.printf("The area of the cylinder is %.2f units squared.\n", Area.getArea(radius, height));
		
	
	}  //  End Main
	

}  //  End Class
