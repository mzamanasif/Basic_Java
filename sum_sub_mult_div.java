package Sum;

import java.util.Scanner;

public class sum_sub_mult_div {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number = ");
		int a = sc.nextInt();
		System.out.print("Enter the second number = ");
		int b = sc.nextInt();
		int sum = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		System.out.println("The Summation is = " + sum);
		System.out.println("The Substraction is =" + sub);
		System.out.println("The Multiplacation is = " + mult);
		System.out.println("The Division is = " + div);
	}

}
