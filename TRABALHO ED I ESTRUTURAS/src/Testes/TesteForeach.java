package Testes;

import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;
import java.util.ArrayList;


public class TesteForeach  {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada();
		@SuppressWarnings("unused")
		ArrayList< Object> list = new ArrayList< Object >();

		for (int i = 0; i< 20000000; i++){
			lde.adicionaNoFim(i);
		}

		long inicio, fim, soma, segundos;

		inicio = System.currentTimeMillis();

		//for (Object lista : lde){

		//}

		//for (long i = 0; i < 20000000; i++){
		//lde.adicionaNoFim(i);
		//}
		fim = System.currentTimeMillis();

		soma= fim-inicio;

		segundos = (soma / 1000) %60;
		System.out.println("Miléssimos de Segundos: " + soma);
		System.out.println("Segundos: "+segundos);


		//20000 vinte mil
		//200000 duzentos mil
		// 2000000 dois milhões
		// 20000000 vinte milhões

		//Perguntar ao Professor porque está dando erro


		//for(Object lista : list) {

		//System.out.println("*"); 


		//}







		//for (String string : lista) {

		//}
	}

}
