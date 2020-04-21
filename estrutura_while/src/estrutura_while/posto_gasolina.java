package estrutura_while;

import java.util.Scanner;

public class posto_gasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		int invalido = 0;
		int obrigada = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4 || tipo ==4){
			if(tipo == 1) {
				alcool += 1;
				System.out.println("Alcool: " + alcool);
			}else if(tipo == 2) {
				gasolina += 1;
				System.out.println("Gasolina: " + gasolina);
			}else if( tipo == 3) {
				disel += 1;
				System.out.println("Disel: " + disel);
			}else if (tipo == 4){
				obrigada += 1;
				System.out.println("Muito Obrigado.");
			}else {
				invalido +=1;
				System.out.println("Código invalido");
			}
			tipo = sc.nextInt();
		}
		sc.close();

	}

}
