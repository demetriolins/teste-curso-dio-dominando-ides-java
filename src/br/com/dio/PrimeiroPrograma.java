package br.com.dio;

import br.com.dio.model.Dogs;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Dogs dog = new Dogs();
		Livros livro = new Livros();
		
		System.out.println(dog);
		System.out.println(livro);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello	 word " + (a+b)); */
	}

}

class Livros {
	private String nome;
	private String npag;
}
