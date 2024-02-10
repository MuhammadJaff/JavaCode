import java.util.*;

public class DotPlusStar {

	public static void main(String[] args) {
		System.out.println("Bismillah");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int times = input.nextInt();
		
		for(int i =1; i <= times;i++) {
			for(int p = 0; p < i ; p++) {
				if(p == 0) {
					System.out.print("");
				}else {
					System.out.print(". ");
				}
			}
			for(int j = times - i+1; j > 0;j--) {
				if( j == times-i+1){
					System.out.print("+");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
