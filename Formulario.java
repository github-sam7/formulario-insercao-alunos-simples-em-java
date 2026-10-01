import java.util.Scanner;

public class Formulario {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno();
		aluno01.setStrNome("Felipe");
		aluno01.setIntMatricula(5363005);
		aluno01.setStrSerie("3º ano");
		
		System.out.println("O(a) aluno(a) "+aluno01.getStrNome()+", com matricula: "+aluno01.getIntMatricula()+" está cursando o "+aluno01.getStrSerie()+"!");

		Aluno aluno02 = new Aluno();
		aluno02.setStrNome("Mauricia");
		aluno02.setIntMatricula(6005678);
		aluno02.setStrSerie("2º ano");
		
		System.out.println("O(a) aluno(a) "+aluno02.getStrNome()+", com matricula: "+aluno02.getIntMatricula()+" está cursando o "+aluno02.getStrSerie()+"!");

		Scanner scnEntrada = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		String strNome = scnEntrada.nextLine();
		
		System.out.println("Qual é o número da sua matrícula?");
		int intMatricula = Integer.parseInt(scnEntrada.nextLine());
		
		System.out.println("Qual é a sua série?");
		String strSerie = scnEntrada.nextLine();
		
		Aluno aluno03 = new Aluno();
		aluno03.setStrNome(strNome);
		aluno03.setIntMatricula(intMatricula);
		aluno03.setStrSerie(strSerie);
		
		System.out.println("O(a) aluno(a) "+aluno03.getStrNome()+", com matricula: "
											+aluno03.getIntMatricula()+" está cursando o "
											+aluno03.getStrSerie()+"!");

		scnEntrada.close();
	}

}
