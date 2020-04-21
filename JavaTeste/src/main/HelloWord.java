package main;

public class HelloWord {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Cleusa", "cleusa@gmail.com", PerfilEnum.CLIENTE);
		System.out.println(cliente.toString());
	}

}