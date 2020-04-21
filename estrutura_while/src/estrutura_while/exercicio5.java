package estrutura_while;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 4;
		int y = 0;
		int i = 0;
		while (i < x) {
			i += 1;
			y += 1;
			System.out.println(i);
			System.out.println(y);
		}
		sc.close();
	}

}
