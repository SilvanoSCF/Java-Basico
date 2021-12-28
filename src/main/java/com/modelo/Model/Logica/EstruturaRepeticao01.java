package com.modelo.Model.Logica;

public class EstruturaRepeticao01 {
	
	public static void main(String[] args) {
		
		double soma = 0;
		int contador = 0;
		double somavalor =0;
		
		//WHILE
		System.out.println("------------------------------------------");
		System.out.println("Estrutura While");
		
		while (contador < 35) {
			
			double valorDoLivro = 59.90;
			
			somavalor = somavalor+valorDoLivro;		
		
			soma += valorDoLivro;
			
			contador++;
			
		//System.out.println(contador+" "+somavalor);
		
		}
		
		System.out.println("O total em estoque é: "+soma);
		
		if (soma < 150) {
				System.out.println("Seu estoque está muito baixo !!! ");			
		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito alto !!! ");
		} else {
			System.out.println("Seu estoque está baixo!!! ");
		}
		
		
		//FOR
		//for(inicialização; condição; atualização) {
		//}
		
		System.out.println("------------------------------------------");
		System.out.println("Estrutura For");
		
		double soma2 = 0;
		for (int contador2 = 0; contador2 < 35; contador2 ++) {
			soma2 += 59.90;
		}
		
		System.out.println("A total em esoque é: "+soma2);
		
		if (soma2 < 150) {
			System.out.println("Seu estoque está muito baixo!");
			} else if (soma2 >= 2000) {
			System.out.println("Seu estoque está muito alto!");
			} else {
			System.out.println("Seu estoque está bom");
			}
		
		
		
		
		
		
	}

}
