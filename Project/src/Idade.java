import java.util.Scanner;

public class Idade {

	public static void main (String[] args) {
		calculoIdade();
	}

	static void calculoIdade ()	{

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int pessoas;

		System.out.println("Quantas pessoas moram na sua casa?");
		pessoas = sc.nextInt();

		int x = 0;
		int listValores[] = new int[pessoas];
		while(x != pessoas) {
			int idadePessoas;
			System.out.println("Digite a idade da proxima pessoas:");
			idadePessoas = sc.nextInt(); 
			listValores[x] = idadePessoas;
			x++;

		}
		int soma = 0;
		for (int i=0; i < pessoas; i++) {
			soma += listValores[i];
		}
		System.out.println("Idade média é :" + (soma / pessoas));


	}


}
