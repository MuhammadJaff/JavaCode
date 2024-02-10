
import java.util.*;
public class CreatePassWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="";
		Scanner input = new Scanner(System.in);
		int count=1;
		while(count !=0) {
			
		System.out.println("Enter a password, we shall check whether its valid or not: ");	
		password = input.next();
		password.toLowerCase();
		if(password.length() != 8) {
			System.out.println("Length must be 8");
			continue;
		}
		int numberOfDigit = 0;
		for(int i = 0; i < password.length();i++) {
			if(password.charAt(i)>='0' && password.charAt(i)<='9') {
				numberOfDigit++;
			}
		}
		if(!(numberOfDigit >=2 && numberOfDigit <= 7)) {
			continue;
		}
		for(int i = 0; i < password.length();i++) {
			if((password.charAt(i)>='0' && password.charAt(i)<='9')||(password.charAt(i)>='a' && password.charAt(i)<='b')) {
				count =0;	
			}else {
				continue;
			}
		}
		System.out.println("You got right password");
		
	  }
	}

}
