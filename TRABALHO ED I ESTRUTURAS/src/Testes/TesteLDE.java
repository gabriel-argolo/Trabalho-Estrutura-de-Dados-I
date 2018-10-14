package Testes;

import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;

public class TesteLDE {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada ();

		@SuppressWarnings("unused")
		long comeco, fim;

		lde.adicionaNoComeco(1);
		lde.adicionaNoComeco(2);
		lde.adicionaNoComeco(3);
		comeco = System.currentTimeMillis();

		for (Object object : lde) {
			System.out.println(object);
		}

	}

}
