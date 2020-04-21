package estrutura_while;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 2;
		int y = 10;

		System.out.println("Olá");
		while (x < y) {
			System.out.println(x + " - " + y);
			x = x * 2;
			y = y + 1;
		}
		sc.close();
	}

}
