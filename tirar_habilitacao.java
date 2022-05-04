package exercicios_prof_ohata;
import java.util.Scanner;

public class tirar_habilitacao {

	public static void main(String[] args) {
		//Titulo do exercicio
		System.out.print("Exercício - Você pode tirar a habilitação ?\n\n");
		
		//Declaracao de variaveis 
		int exame_psi, exame_leg, exame_dir;
		
		//Declaracao de Scanner que sera usado para a entrada de dados
		Scanner input = new Scanner(System.in);
		
		//Entrada de dados exame_psi, exame_leg, exame_dir
		System.out.println("Você foi aprovado no exame psicotécnico ? \nSim(0)\nNao(1)");
		exame_psi = input.nextInt();
		
		System.out.println("Você foi aprovado no exame de legislação ? \nSim(0)\nNao(1)");
		exame_leg = input.nextInt();
		
		System.out.println("Você foi aprovado no exame de direção ? \nSim(0)\nNao(1)");
		exame_dir = input.nextInt();
		
		//Conferindo respostas do usuario
		if (exame_psi == 0 && exame_leg == 0 && exame_dir == 0) {
			System.out.println("Parabéns, você pode tirar sua habilitação!!!");
		}
		else {
			System.out.println("Que pena, você não pode tirar sua habilitação!!!");
		}
	}
}
