
// O comando abaixo faz com que palvras que esteja marcadas com erro sejam adotas e aceitas ex: Scanner

import java.util.Scanner;

// Este programa deve receber o nome de úsuario e exibir este nome com uma interação.

public class ProgramaNome {

	public static void main(String[] args) {
	
		// Alinha abaixo cria um leitor para vermos lermos o teclado do usúario.
		
		Scanner Leitor = new Scanner(System.in);
		
		// A linha abaixo cria uma variável (espaço na RAM)  para guardar dados do tipo String (Textos)
		
		String nome;
		
	
		System.out.println("Por Favor Digite seu Nome:");
		
		// A linha abaixo pega o texto digitado pelo usuário e guarda na variável "nome"
		
		nome = Leitor.next();
		
		// Para criarmos lermos textos com espaço, usamos ..... nome = Leitor.nextline();
		
		// Este código faz com que ocorra leitura do teclado do usúario, guarde esta informação (o nome) e ainda interaja.
		
		System.out.println("Que legal que seu nome é: " + Leitor.next());
		
		
		
	}

}
