package demo;
import java.util.Scanner;

public class Calculator {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 1st no");
			int a=sc.nextInt();
			System.out.println("Enter 2nd no");
			int b=sc.nextInt();
			
			System.out.println("Addition : "+Maths.add(a, b));
			
			sc.close();
	}

}
