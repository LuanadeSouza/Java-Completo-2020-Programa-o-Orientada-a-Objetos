package estrutura_while;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 5;
		int y = 0;
		while (x > 2) {
			System.out.println(x + " - " + y);
			y = y + x;
			x = x - 1;

		}

		sc.close();
	}

}
