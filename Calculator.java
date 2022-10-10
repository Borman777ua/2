import java.util.Scanner;

public class Calculator {
	static Scanner scanner = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double BMR = 0;

		System.out.println("Your weight:  ");
		double weight = scanner.nextDouble();
		System.out.println("Your height: ");
		double height = scanner.nextDouble();
		System.out.println("Your age: ");
		byte age = scanner.nextByte();

		System.out.println("Your gender M - MALE; F - FEMALE : ");
		String gender = input.nextLine();
		switch (gender) {
			case "M":
				BMR = (10 * weight) + (6.25 * height) - (5 * age) + 5;
				break;
			case "F":
				BMR = (10 * weight) + (6.25 * height) - (5 * age) - 161;
				break;
		}

		double low_activity = 1.2;
		double light_activity = 1.375;
		double average_activity = 1.55;
		double hard_activity = 1.725;
		double extreme_activity = 1.9;
		double protein = weight * 2;

		System.out.println("Select your daily activity: ");
		System.out.println("'A':Low activity (No workout, sitting job)");
		System.out.println("'B':Light activity(light trainings 1-3 times per week)");
		System.out.println("'C':Average activity(3-5 times per week workouts)");
		System.out.println("'D':Hard activity(6-7 times per week workouts)");
		System.out.println("'E':Extreme activity(Hard physically job + 2 workouts per day)");
		String line = input.nextLine();

		switch (line) {
			case "A":
				double b = BMR * low_activity;
				double c = b - 500;
				System.out.println("Your Basic metabolism is: " + BMR + " kcal ");
				System.out.println("Your daily calories intake will be: " + b + " kcal ");
				System.out.println("To lose weight, your daily calories intake with 500 kcal deficit will be: " + c + " kcal ");
				System.out.println("Your protein intake will be: " + protein + " g ");
				break;

			case "B":
				b = BMR * light_activity;
				c = b - 500;
				System.out.println("Your Basic metabolism is: " + BMR + " kcal ");
				System.out.println("Your daily calories intake will be: " + b + " kcal ");
				System.out.println("To lose weight, your daily calories intake with 500 kcal deficit will be: " + c + " kcal ");
				System.out.println("Your protein intake will be: " + protein + " g ");
				break;
			case "C":
				b = BMR * average_activity;
				c = b - 500;
				System.out.println("Your Basic metabolism is: " + BMR + " kcal ");
				System.out.println("Your daily calories intake will be: " + b + " kcal ");
				System.out.println("To lose weight, your daily calories intake with 500 kcal deficit will be: " + c + " kcal ");
				System.out.println("Your protein intake will be: " + protein + " g ");
				break;
			case "D":
				b = BMR * hard_activity;
				c = b - 500;
				System.out.println("Your Basic metabolism is: " + BMR + " kcal ");
				System.out.println("Your daily calories intake will be: " + b + " kcal ");
				System.out.println("To lose weight, your daily calories intake with 500 kcal deficit will be: " + c + " kcal ");
				System.out.println("Your protein intake will be: " + protein + " g ");
				break;
			case "F":
				b = BMR * extreme_activity;
				c = b - 500;
				System.out.println("Your Basic metabolism is: " + BMR + " kcal ");
				System.out.println("Your daily calories intake will be: " + b + " kcal ");
				System.out.println("To lose weight, your daily calories intake with1 500 kcal deficit will be: " + c + " kcal ");
				System.out.println("Your protein intake will be: " + protein + " g ");
		}
	}
}
