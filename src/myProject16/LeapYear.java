package myProject16;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[]args) {
		int year;
		Scanner inp=new Scanner(System.in);
		System.out.print("Please enter a year:");
		year=inp.nextInt();
		if(year%4==0) {
			System.out.println("This is not a leap year");
		}
		else {
			System.out.println("This is a leap year");
		}
	}

}
