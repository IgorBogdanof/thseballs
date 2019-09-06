package thseballs;

import java.util.Scanner;

public class uppg1 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int banana = input.nextInt();
		int sum = banana;
		while (banana != 0) {
			
			banana = input.nextInt();
			
			sum += banana;
		}
		System.out.println(sum);
	}
}
