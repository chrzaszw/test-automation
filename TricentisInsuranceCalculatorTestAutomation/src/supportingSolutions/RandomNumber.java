package supportingSolutions;

import java.util.Random;

public class RandomNumber {

	public static int myRandomInt(int n) {

		Random rand = new Random();

		int i = rand.nextInt(n);
		return i;
	}
}
