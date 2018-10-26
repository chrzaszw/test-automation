package supportingSolutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PasswordWriter {

	public static String getPassword(String filePath) throws FileNotFoundException {

		String password = "";
		Scanner se = new Scanner(new File(filePath));
		if (se.hasNextLine()) {
			password = se.nextLine();

		}
		se.close();
		return password;

	}
}
