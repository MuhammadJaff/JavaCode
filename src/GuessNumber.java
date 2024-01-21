import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		
		int generated = (int)(Math.random() * 100);
		Scanner input = new Scanner(System.in);
		System.out.print("Guess the number ");
		int takeGuess = input.nextInt();
		
		while(takeGuess > generated || takeGuess < generated) {
			if(takeGuess > generated) {
				System.out.println("Higher guess \n");
			}else{
				System.out.println("Lower guess \n");
			}
			System.out.print("Guess the number ");
			takeGuess = input.nextInt();	
		}
		if(takeGuess == generated) {
			System.out.println("You found the number");
		}
	}
}
