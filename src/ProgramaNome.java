
// O comando abaixo faz com que palvras que esteja marcadas com erro sejam adotas e aceitas ex: Scanner

import java.util.Scanner;

// Este programa deve receber o nome de �suario e exibir este nome com uma intera��o.

public class ProgramaNome {

	public static void main(String[] args) {
	
		// Alinha abaixo cria um leitor para vermos lermos o teclado do us�ario.
		
		Scanner Leitor = new Scanner(System.in);
		
		// A linha abaixo cria uma vari�vel (espa�o na RAM)  para guardar dados do tipo String (Textos)
		
		String nome;
		
	
		System.out.println("Por Favor Digite seu Nome:");
		
		// A linha abaixo pega o texto digitado pelo usu�rio e guarda na vari�vel "nome"
		
		nome = Leitor.next();
		
		// Para criarmos lermos textos com espa�o, usamos ..... nome = Leitor.nextline();
		
		// Este c�digo faz com que ocorra leitura do teclado do us�ario, guarde esta informa��o (o nome) e ainda interaja.
		
		System.out.println("Que legal que seu nome �: " + Leitor.next());
		
		
		
	}

}
