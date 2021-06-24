/*
 * Classname             (Central)
 *
 * Version information   (Dev Pre-Alpha)
 *
 * Date                  (06/19 e 10h29AM)
 *
 * author                (Leonardo Patricio)
 * Copyright notice      (Metodo central/menu)
 */

//import java.awt.List;
//import java.util.ArrayList;
import java.util.Scanner;

public class Central {

	public static void main (String[] args) {
		menu();
	}

	static void menu (){
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Escolha uma opção abaixo: ");
			System.out.println("1 -> Calcular a idade média da sua casa");
			System.out.println("2 -> Calcular a média salarial da sua casa");
			System.out.println("0 -> para sair");

			opcao = sc.nextInt();

			if(opcao == 1) {
				Idade.main(null);
			}else if(opcao == 2) 
				Salario.main(null);


		}while(opcao != 0); 
		if(opcao == 0) {
			System.out.println("Bye bye :D");	
		}
		
		sc.close();
	}
}