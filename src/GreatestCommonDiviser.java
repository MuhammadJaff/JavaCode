import java.util.*;

public class GreatestCommonDiviser {

	public static void main(String[] args) {
		System.out.println("Bismillah");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 number to find its Greatest Common Diviser ");
		int first = input.nextInt();
		int second = input.nextInt();
		System.out.println(gcd(first,second));
	}
	static int gcd(int n1, int n2) {
		int gcd =1;
		int temp;
		if(n1 > n2 )
			temp = n1;
		else temp = n2;
		
		for(int k=1;k <= temp/2;k++) {
			if(n1 % k ==0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;
	}
}
