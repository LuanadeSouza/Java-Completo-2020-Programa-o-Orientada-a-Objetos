package estrutura_while;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;

		while (x < 5) {
			int y = x * 3;
			System.out.println(x + " - " + y);
			x = x + 1;
		}
		System.out.println("Fim!");
		sc.close();
	}

}
