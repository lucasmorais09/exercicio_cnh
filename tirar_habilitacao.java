package exercicios_prof_ohata;
import java.util.Scanner;

public class tirar_habilitacao {

	public static void main(String[] args) {
		//Titulo do exercicio
		System.out.print("Exerc�cio - Voc� pode tirar a habilita��o ?\n\n");
		
		//Declaracao de variaveis 
		int exame_psi, exame_leg, exame_dir;
		
		//Declaracao de Scanner que sera usado para a entrada de dados
		Scanner input = new Scanner(System.in);
		
		//Entrada de dados exame_psi, exame_leg, exame_dir
		System.out.println("Voc� foi aprovado no exame psicot�cnico ? \nSim(0)\nNao(1)");
		exame_psi = input.nextInt();
		
		System.out.println("Voc� foi aprovado no exame de legisla��o ? \nSim(0)\nNao(1)");
		exame_leg = input.nextInt();
		
		System.out.println("Voc� foi aprovado no exame de dire��o ? \nSim(0)\nNao(1)");
		exame_dir = input.nextInt();
		
		//Conferindo respostas do usuario
		if (exame_psi == 0 && exame_leg == 0 && exame_dir == 0) {
			System.out.println("Parab�ns, voc� pode tirar sua habilita��o!!!");
		}
		else {
			System.out.println("Que pena, voc� n�o pode tirar sua habilita��o!!!");
		}
	}
}
