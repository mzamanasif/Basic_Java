package Sum;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number = ");
		int a = sc.nextInt();
		System.out.print("Enter the second number = ");
		int b = sc.nextInt();
		int add = a + b;
		System.out.println("Total Number is = " + add);

	}
}
