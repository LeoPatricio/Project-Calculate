import java.util.Scanner;

public class Switch {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha uma: 1-A, 2-B"); 
		int opcaoselecionada = sc.nextInt();

		switch(opcaoselecionada) {
		case 1:
			System.out.println("Hello.");
			break;
		case 2: 
			System.out.println("Bye.");
			break;

		}

		sc.close();
	}

}
