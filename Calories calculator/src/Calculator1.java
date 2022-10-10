import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.util.Scanner;

public class Calculator1 {
static	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

	}

	double BMR () {

		System.out.println("Your weight: " );
		System.out.println("Your height: ");
		System.out.println("Your age: " );
		System.out.println("Your gender: ");

		double BMR = 0;
		if ("Male".equals(Person.gender)) {
			BMR = 10 * Person.weight + 6.25 * Person.height - 5 * Person.age + 5;
		} else if ("Female".equals(Person.gender)) {
			BMR = 10 * Person.weight + 6.25 * Person.height - 5 * Person.age - 161;
		}
		return BMR;
	}
}
