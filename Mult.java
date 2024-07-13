package Sum;

import java.util.Scanner;

public class Mult {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number = ");
		int a = sc.nextInt();
		System.out.print("Enter the second number = ");
		int b = sc.nextInt();
		int mult = a * b;
		int div = a / b;
		System.out.println("Result is = " + mult);
		System.out.print("Division Result is = " + div);
	}
}
