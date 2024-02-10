package QuizvsAssignment;
import java.util.Scanner;

public class Quiz3 {
	static int arr[];
	public static void main(String[] args) {
		System.out.println("Bismillah");	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = input.nextInt();
		createArray(num);
	}
	public static int[] createArray(int n) {
		arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] =i;
		}
		shuffleArray(arr);
		return arr;
	}
	public static int[] shuffleArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int random = (int)(Math.random() * arr.length);
			int temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
		}
		printPermutation(arr);
		return arr;
	}
	public static void printPermutation(int[] arr) {
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i =0; i<arr.length;i++) {
			int inner=0;
//			First find the order of value from 0 to n
			for(int j=0; j<arr.length;j++) {
				if(arr[i] == j) {
					inner =i;
					break;
				}
			}
//			Then print it;
			for(int k=0;k<arr.length;k++) {
				if(arr[k] == inner) {
					System.out.print("* ");
				}else {
					System.out.print(". ");
				}
			}
			inner=0;
			System.out.println();
		}
	}
}
