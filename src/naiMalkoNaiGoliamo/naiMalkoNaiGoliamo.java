package naiMalkoNaiGoliamo;

import java.util.Scanner;

public class naiMalkoNaiGoliamo {

	public static void main(String[] args) {
		int min = 0;
		int max = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Въведете броя на сравняваните цели числа:");
		int number = input.nextInt();

		System.out.println("Въведете целите числа:");
		for (int i = 0; i < number; i++) {
			int n = input.nextInt();
			if (i == 0) {
				min = n;
				max = n;
			}
			if (n < min)
				min = n;
			if (n > max)
				max = n;
		}

		System.out.println("\n" + "Най-малкото: " + min);
		System.out.println("Най-голямото: " + max);

	}

}
