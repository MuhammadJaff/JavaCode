import java.util.*;

public class ArrayWorkOut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		// array length is taken by user
		int arrayLength = input.nextInt();
		double[] myList = new double[arrayLength];
		System.out.println("Now, enter " + arrayLength + " values: ");
		// now take that n values
		for (int i = 0; i < myList.length; i++) 
		myList[i] = input.nextDouble();
		
		System.out.println("\nThe values you entered is: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
//		Max value
		double max=0;
		System.out.println("\n\nAnd the max value is: ");
		for (int i = 0; i < myList.length; i++) {
			if(myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.print(max);
		
//		Shuffling
		for(int i=0; i< myList.length;i++) {
			int random = (int)(Math.random()* (myList.length));
			double change = myList[i];
			myList[i] = myList[random];	
			myList[random] = change;
			
		}
		System.out.println("\n\nNow, randomly shuffled form: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
//		Shifted one, right
		System.out.println("\n\nNow, shifted form: ");
		double last = myList[myList.length-1];
		for(int i = myList.length-1; i > 0;i--) {
			myList[i] = myList[i-1];
		}
		myList[0]=last;
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		int total =0;
		double average=0;
		for(int i=0;i<myList.length;i++) {
			total += myList[i];
		}
		average = (double)total/(myList.length);
		System.out.printf("\n\nSum is %d \n\nAverage is %.1f\n",total,average);
//		System.out.printf("\nAverage is %.1f",average);

		System.out.println("\nNow you will see numbers above average");
		for(int i=0;i<myList.length;i++) {
			if(myList[i] >= average) {
				System.out.print(myList[i] + " ");
			}
		}
	}

}
