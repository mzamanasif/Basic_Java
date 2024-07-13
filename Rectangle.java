package Sum;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for Height = ");
		int height = sc.nextInt();
		System.out.print("Enter value for Width = ");
		int width = sc.nextInt();
		int area = height*width;
		System.out.print("Rectangle Area is = "+area);
	}
}
