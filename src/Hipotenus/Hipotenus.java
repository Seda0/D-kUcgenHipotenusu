package Hipotenus;

import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Kenar 1 : ");
		int kenar1 = scanner.nextInt();
		System.out.print("Kenar 2 :");

		int kenar2 = scanner.nextInt();
		double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
		System.out.print("Hipotenus : " + hipotenus);
	}

}
