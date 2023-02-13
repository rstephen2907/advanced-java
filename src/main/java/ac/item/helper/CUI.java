package ac.item.helper;

import java.util.Scanner;

public class CUI {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static int acceptInt(String options) {
		// TODO Auto-generated method stub
		System.out.println(options);
		return scanner.nextInt();
	}

	public static void display(Object message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		
	}

	public static String acceptString(String message) {
		// TODO Auto-generated method stubs
		System.out.println(message);
		return scanner.next();
	}

}
