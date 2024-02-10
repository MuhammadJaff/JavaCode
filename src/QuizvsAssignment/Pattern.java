package QuizvsAssignment;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Bismillah");
		System.out.println("Pattern A");
		for(int i =1; i<=6;i++) {
			for(int j =1; j <=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("Pattern B");
		for(int b =6; b >= 1;b--) {
			for(int j =1; j <=b ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("Pattern C");
		for(int c =1; c<=6;c++) {
			for(int ch= 1;ch <=6-c;ch++) {
				System.out.print("  ");
			}
			for(int j =1; j <=c ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("Pattern D");
		for(int d =6; d>=1;d--) {
			for(int ch=1;ch <=6-d;ch++) {
				System.out.print("  ");
			}
			for(int j =1; j <=d ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
