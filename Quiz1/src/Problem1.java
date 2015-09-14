import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of Touchdowns: ");
		double touchdowns = input.nextDouble();
		
		System.out.print("Enter total number of yards gained: ");
		double yards = input.nextDouble();
		
		System.out.print("Enter number of interceptions: ");
		double interceptions = input.nextDouble();
		
		System.out.print("Enter number of completions: ");
		double completions = input.nextDouble();
		
		System.out.print("Enter number of passes attempted: ");
		double passattempts = input.nextDouble();
		
		//Compute calculation a
		double calculationa = ((completions / passattempts) - 0.3) * 5;
		//Compute calculation b
		double calculationb = ((yards / passattempts)-3) * 0.25;
		//Compute calculation c
		double calculationc = (touchdowns / passattempts) * 20;
		//Compute calculation d
		double calculationd = 2.375 - ((interceptions / passattempts) * 25);
		
		//Calculate final Passer Rating
		double Passerrating = ((calculationa + calculationb + calculationc + calculationd) / 6) * 100;
		
		//Display Passer rating
		System.out.print("The Quarterback rating of the given statistics is " + Passerrating);
		
	}
}