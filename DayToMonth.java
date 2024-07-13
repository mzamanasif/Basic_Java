package Sum;
import java.util.Scanner;
public class DayToMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day = ");
		int day = sc.nextInt();
		int month = day/30;
		int newDay = day-(month*30);
		System.out.println(day+" day is equal to  " +month+ " month and  " +newDay+ " day");
		
		
	}
}
