/*
 * Brendan Howell
 * CSC-151
 * This project will calculate the area of a 
 * circle, rectangle and a cylinder using overloaded
 * static methods
 */
public class Area {
	// get area of a circle
	public static double getArea(double radius){
		return Math.PI * radius * radius;
	}
	
	// get area of a rectangle
	public static double getArea(int length, int width){
		return length*width;
	}
	
	// get area of a cylinder
	public static double getArea(double radius, double height){
		return Math.PI * radius * radius * height;	
	}

}