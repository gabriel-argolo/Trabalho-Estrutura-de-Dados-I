package Testes;

import ListaSimplesmenteEncadeada.ListaSimplesmenteEncadeada;

public class TesteLSE {

	public static void main(String[] args) {
		ListaSimplesmenteEncadeada lse = new ListaSimplesmenteEncadeada();
		long comeco,fim;

		comeco = System.currentTimeMillis();

		//Perguntar ao Professor qual a forma de adicionar utilizar

		//Adicionando o indice por po posição
		for (int i = 0; i< 20000; i++){
			lse.adicionaPorPosicao(i, i);
		}

		//Adicionar o indice no começo
		for (int i = 0; i< 20000; i++){
			lse.adicionaNoComeco(i);
		}

		//Adicionar o indice no fim
		for (int i = 0; i< 20000; i++){
			lse.adicionaNoFim(i);
		}

		fim = System.currentTimeMillis();

		System.out.println("O tempo gasto foi: "+ (comeco-fim));

		//Perguntar porque o resultado está dando negativo

		//Falta Fazer os foreach

	}

}
