package estrutura_while;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 100;
		int y = 100;
		while (x != y) {
			System.out.print("olha");
			x = (int) Math.sqrt(y);
		}
		sc.close();
	}

}
