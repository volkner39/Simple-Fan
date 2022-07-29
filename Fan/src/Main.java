package src;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// Create a Fan
		Fan f = new Fan();
		Scanner sc = new Scanner(System.in);
		
		// Print default fan settings
		System.out.println("Fan speed is: " + f.get_fan_speed());
		System.out.println("Fan direction is: " + f.get_fan_direction());
		
		// Keep looping because the fan is always powered 'on'
		while(true) {
			
			// Ask user to pull a cord
			System.out.println("Pick an option (1 or 2):\n"
					+ "1. Pull cord to increase fan speed.\n"
					+ "2. Pull cord to change fan direction.");
			String s = sc.nextLine();
			
			if (s.equals("1")) {
				f.increase_fan_speed();
				System.out.println("Fan speed is: " + f.get_fan_speed());
				System.out.println("Fan direction is: " + f.get_fan_direction() + "\n");

			}
			else if (s.equals("2")) {
				f.reverse_fan_direction();
				System.out.println("Fan speed is: " + f.get_fan_speed());
				System.out.println("Fan direction is: " + f.get_fan_direction() + "\n");
			}
			else {
				System.out.println("Please enter a valid option number!\n");
			}
		
		}

	}

}
