package crystal;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
	public static void main(String[] args) {

		int[] lottoNumbers = generateLottoNumbers();
		System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
	}

	public static int[] generateLottoNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		
		for (int i = 0; i < 6; i++) {
			int number;
			do {
				number = random.nextInt(45) + 1;
			} while (contains(numbers, number));
			
			
			numbers[i] = number;
		}
		return numbers;
	}
	public static boolean contains(int[] array, int number) {
		for (int value : array) {
			if (value == number ) {
				return true;
			}
		}
		return true;
	}
}


