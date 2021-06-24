import java.util.Scanner;

public class Salario {

	public static void main (String []args) {
		calculoSalario();
	}

	static void calculoSalario () {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int trabalhadores;

		System.out.println("Quantas pessoas trabalham na sua casa?");
		trabalhadores = sc.nextInt();

		int x = 0;
		int listSalarios[] = new int[trabalhadores];
		while(x != trabalhadores) {
			float salarios;
			System.out.println("Digite o salario da proxima pessoa: ");
			salarios = sc.nextFloat(); 
			listSalarios[x] = (int) salarios;
			x++;

		}
		int result = 0;
		for (int i=0; i < trabalhadores; i++) {
			result += listSalarios[i];
		}
		System.out.println("A média salarial é: " + (result / trabalhadores));




	}

}
