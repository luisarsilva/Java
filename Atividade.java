package aulaJPA.aula01;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		
		
		System.out.println("Informe seu nome:");
		nome = ler.next();
		
		System.out.println("Informe sua idade:");
		idade = ler.nextInt();
		
		System.out.println("Seus dados são: " + nome + idade );
		

	}

}
