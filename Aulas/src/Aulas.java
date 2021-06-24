import java.text.DecimalFormat;
import java.util.Scanner;

public class Aulas {

	public static void main (String[] args) {
		float imc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu altura?: ");
		float altura = sc.nextFloat();
		System.out.println("Qual a sua peso?: ");
		float peso = sc.nextFloat();
		sc.close();
		imc = peso / (altura*altura);
		DecimalFormat df = new DecimalFormat("##.##");
		System.out.println("Seu imc é de: " +df.format(imc));
		}



}