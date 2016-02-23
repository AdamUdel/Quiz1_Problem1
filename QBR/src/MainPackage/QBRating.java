package MainPackage;

import java.util.Scanner;

public class QBRating{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the total number of completions: ");
		double COMP = input.nextDouble();
		System.out.println("Enter the total number of attempts: ");
		double ATMPS = input.nextDouble();
		System.out.println("Enter the total number of yards: ");
		double YARDS = input.nextDouble();
		System.out.println("Enter the total number of touchdowns: ");
		double TD = input.nextDouble();
		System.out.println("Enter the total number of interceptions: ");
		double INT = input.nextDouble();
		
		input.close();

		double a = ((COMP/ATMPS) - 0.3)*5;
		double b = ((YARDS/ATMPS)-3)*0.25;
		double c = (TD/ATMPS)*20;
		double d = 2.375 - ((INT/ATMPS)*25);
		double QBR = 100*((a+b+c+d)/6);

		System.out.print("The Quarterback had a Rating of: ");
		System.out.printf("%.2f%n", QBR);

	}
}