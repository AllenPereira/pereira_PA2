import java.util.Scanner;
public class Polling {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		char answer= 'Y';
		int i;
		int j;
		String[] topics = {"Politics", "Climate Change", "World Hunger", "Economy","Employment"};
		int[][] responses = new int[5][10];
		int total=0;
		int max, maxLocation, min, minLocation;
		
		System.out.println("Would you like to start polling?(Enter Y for yes N for no)");
		answer = scnr.next().charAt(0);
		
		
		
		
		while(answer == 'Y') {	
		System.out.printf("Rate the following topics from 1(least important) to 10(most important)\n\n");
		
		for (i=0; i<5; i++) {
			System.out.println(topics[i] +": ");
			int rating = scnr.nextInt();
			for(j=i; j<i+1; j++) {
				responses[i][rating-1]++;
			 }
		}
		
		System.out.println("Would you like to continue polling?(Y for yes, N no No");
		answer = scnr.next().charAt(0);
		}
		
		System.out.printf("%20d ", 1);
		
		for(i=2; i<=10; i++) {
			System.out.printf("%4d ",i);
		}
		
		System.out.printf("%3c  Average", '|');
		System.out.println();
		
		for(i=1; i<=90; i++) {
			System.out.print("-");
		}
		
		int total2=0;
		
		System.out.println();
		for(i=0; i<5; i++) {
			System.out.printf("%-19s", topics[i]);
			for(j=0; j<10; j++) {
				total = total + responses[i][j] * (j+1); 
				total2 = total2 + responses[i][j]; 
				System.out.printf("%-4d ",responses[i][j]);
				if(j==9) {
					double average = total/(double)total2;
					System.out.printf("%6.2f", average);
				}
			}
			
			total=0;
			total2=0;
			System.out.println();
		}
		
		max=0;
		min = 0;
		maxLocation=0;
		minLocation=0;
		
		for(i=0; i<1; i++) {
			for(j=0; j<10; j++) {
				total = total + responses[i][j] * (j+1); 
			}
		max = total;
		min =total;
		}	
		
		
		for(i=1; i<5; i++) {
			total=0;
			for(j=0; j<10; j++) {
				total = total + responses[i][j] * (j+1);
			}
			if(total> max) {
				max=total;
				maxLocation = i; 
			}
			if(total < min) {
				min=total;
				minLocation = i;
			}
		}
		System.out.printf("\n%s scored the highest. It recived %d points\n", topics[maxLocation], max);
		System.out.printf("%s scored the lowest. It recieved %d points\n", topics[minLocation], min);
		scnr.close();
	}	
}

