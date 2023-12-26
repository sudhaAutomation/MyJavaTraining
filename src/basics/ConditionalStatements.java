package basics;

import java.util.ArrayList;
import java.util.List;

public class ConditionalStatements {

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

		System.out.println(findFactors(20));
		// >> << >>>

	}

	static boolean isPrime(int number) {
		int i = 2;
		while (i <= number / 2) {
			if (number % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	static List<Integer> findFactors(int number) {
		List<Integer> factors = new ArrayList<>();
		int i = 1;
		while (i <= number) {
			if (number % i == 0) {
				factors.add(i);
			}
			i++;
		}
		return factors;
	}

}
