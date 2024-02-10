
public class FibonacciNumbers {
	public static void main(String[] args) {
		int[] fibonacci= new int[40];
		fibonacci[0] = 0; 
		fibonacci[1] = 1;
		for(int i = 2; i < fibonacci.length;i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]; 
		}
		
		System.out.println("Fibonacci Numbers");
		int count = 0;
		for(int p =0; p<fibonacci.length;p++) {
			System.out.printf( "%-10d",fibonacci[p]);
			count++;
			if(count % 10 ==0) {
				System.out.println();
			}
		}
	}
}
