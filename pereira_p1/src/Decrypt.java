import java.util.Scanner;
public class Decrypt {
public static void main(String arg[]) {
		
		Scanner scnr = new Scanner(System.in);
		int i;
		int[] number = new int[4]; 
		
		System.out.println("Enter four digit number. Use spaces between each digit");
		
		for(i=0; i<4; i++) {
			number[i] = scnr.nextInt();
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
		
			
			
		
		for(i=0; i<4; i++) {
			if(number[i] +3 >= 10) {
				number[i] = (number[i] +3)%10;
			}
			else {
				number[i] = number[i] +3;
			}
		}
	
		for(i=0; i<4; i++) {
		System.out.print(number[i]);
		
		}
		
		
		scnr.close();
	}
}
