import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Do you want to use Customary or Metric units of measurement?(Type in C for Customary, M for Metric)");
		char unitOfMeasurement = scnr.next().charAt(0);
		
		if(unitOfMeasurement == 'C') {
			
			System.out.println("Enter your weight in pounds");
			double weight = scnr.nextDouble();
			
			System.out.println("Enter your height in inches");
			double height = scnr.nextDouble();
			
			double BMI = (703 * weight)/Math.pow(height, 2);
			
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
			System.out.printf("\nYour BMI is %.1f", BMI);
		}
		if(unitOfMeasurement == 'M') {
			System.out.println("Enter your weight in kilograms");
			double weight = scnr.nextDouble();
			
			System.out.println("Enter your height in meters");
			double height = scnr.nextDouble();
			
			double BMI = weight/Math.pow(height, 2);
			
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
			System.out.printf("\nYour BMI is %.1f", BMI);
		}
			
			scnr.close();
	}
		
		
}

