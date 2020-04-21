package exercicio_um_fixacao;

public class exercicioUm {

	public static void main(String[] Args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
	    TesteStatic.somaValores(5, 5);
		System.out.println("Resultado da Soma: " + TesteStatic.somaValores(5, 5));

		System.out.printf("%s , which price is $ %2f %n", product1, price1);
		System.out.printf("%s desk, which price $ %2f %n", product2, price2);
		System.out.printf("Record: %d yers old, code %d and gender : %s %n", age, code, gender);
		System.out.printf("Measue with eith decimal places: %8f %n", measure);
		System.out.printf("Rouded (thrtrr decimsl places %3f: %n", measure);
		System.out.printf("Us decimsl point: %3f  %n", measure);
	}

}
