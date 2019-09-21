import java.util.Scanner;
public class Encrypt {
public static void main (String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int[] number = new int[4];
		int i;
		
		
		System.out.println("Enter a 4 digit integer. Use spaces to seperate each digit");
		
		for(i=0; i<number.length; i++) {
			number[i] = scnr.nextInt();
			}
		
		for(i=0; i<number.length; i++) {
			number[i] = (number[i] + 7)%10;
		}
		
			
		for(i=0; i<2; i++) {
			if(i==0) {
				int temp = number[i];
				number[i] = number[i+2];
				number[i+2] = temp;
			}
			else {
				int temp = number[i];
				number[i] = number[i+2];
				number[i+2] = temp;
			}
		}
		
		for(i=0; i<number.length; i++) {
			System.out.print(number[i]);
		}
		
		scnr.close();
	}
}
