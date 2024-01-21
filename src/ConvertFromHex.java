import java.util.*;

public class ConvertFromHex{

	public static void main(String[] args) {
//		Hex to decimal
		Scanner input = new Scanner(System.in);
		
		String s="";
		int repeat = 0,count=1;
		while(repeat == 0) {
			char check='0';
			System.out.print("Enter HEX number to convert it decimal ");
			s = input.next().toUpperCase();
			toHex(s);
			System.out.print("Do you want to continue (y or n): ");
			check = input.next().charAt(0);
			System.out.println(check);
			if(check == 'y' || check == 'Y') {
				count++;
				continue;
			}
			repeat =-1;
		}
		
		System.out.println("You used our program " + count +" times");
	}
	private static void toHex(String s) {
		char one = ' ';
		System.out.println(s);
		int sum = 0,digitOf = 0;
		for(int len = (s.length()-1), k = 0;len >= 0 && k < s.length();len--,k++) {
			
			one = s.charAt(len);
			if(Character.isDigit(one)) {
				digitOf = one- 48;
			} else if(Character.isLetter(one) && one - 55 <= 15) {
					digitOf = one - 55;
				} 			
			 else {
				System.out.println("Something wrong happened, try again");
				System.exit(0);
			}
			double calc = (digitOf * Math.pow(16, k));
			sum += calc;
		}
		System.out.println("The decimal value is  " + sum);
	}
}
