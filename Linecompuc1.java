package linecomparision;

import java.util.Scanner;

public class Linecompuc1 {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		getLineCordinate();
	}
		public static void getLineCordinate() {
			System.out.println("To model a line ");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the point P cordinate ");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			System.out.println("Point P cordinatec (x ,y) = ( " + x1 + "," + y1 + " )" );
			System.out.println("enter the point Q cordinate ");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			System.out.println("Point Q cordinatec (x ,y) = ( " + x2 + "," + y2 + " )" );
			
			  int lineLength = calculateLineLength(x1,y1,x2,y2);
			System.out.println(" length of line: " + lineLength);

		}
		public static int calculateLineLength(int x1,int y1, int x2, int y2) {
			
			 int length = (int) Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1),2)) );
			return length;
		}

}
