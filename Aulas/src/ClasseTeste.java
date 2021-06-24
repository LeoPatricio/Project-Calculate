import java.util.Scanner;

public class ClasseTeste {


	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
			float peso;
			float altura;
			System.out.println("Qual seu peso? ");
			peso = sc.nextFloat();
			
			System.out.println("Qual sua latura? ");
			altura = sc.nextFloat();
			
			float cAltura = altura*altura;	
			float cImc = peso / cAltura;
			
			System.out.println("Seu imc é: " + cImc);
			
			sc.close();
	}

}


