package TestesDuplamenteEncadeada;

import ListaDuplamenteEncadeada.ListaDuplamenteEncadeada;

public class TesteExcluirElemento_LDE {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada();

		long inicio, fim, soma, segundos, horas, minutos;

		// a v�riavel inicio est� sendo usada para cronometrar o tempo de inicio
		inicio = System.currentTimeMillis();

		//o for esta sendo utilizado para adicionar os elementos 
		for (long i = 0; i <= 20000000; i++){
			lde.adicionaNoComeco(i);;
		}

		int elementoDesejado = 19000000;

		//Usei o for para percorrer o tamanho da lista e verificar se o elemento existe ou n�o
		// Se o valor existir vai retornar "Elemento Existe" e se n�o existe vai n�o vai retornar nada
		for (int i = 0; i<=lde.tamanho(); i++ ){

			int elemento = i;
			if (elemento == elementoDesejado){
				lde.removePorPosicao(elementoDesejado);
				System.out.println("Elemento Existe e foi excluido: " + elementoDesejado);

			}

		}
		;



		// a v�riavel fim est� sendo usada para cronometrar o tempo em que o algoritmo levou para adicionar 
		// os elementos
		fim = System.currentTimeMillis();

		// essa soma � feita para ver o tempo total gasto (O resultado � em Miles Segundos
		soma= fim-inicio;

		// Calculo para converter miles segundos em "segundos"
		segundos = ( soma / 1000 ) % 60;      // se n�o precisar de segundos, basta remover esta linha.

		// Calculo para converter miles segundos em "Minutos"
		minutos  = ( soma / 60000 ) % 60;     // 60000   = 60 * 1000

		// Calculo para converter miles segundos em "Horas"
		horas    = soma / 3600000;            // 3600000 = 60 * 60 * 1000

		System.out.println("Tempo Gasto para Excluir o Elemento: "+elementoDesejado);

		//Usei o String.format para formatar o resultado em Horas/Minutos/Segundos, com as casas decimais
		System.out.println( String.format("Horas/Minutos/Segundos: "+ "%03d:%02d:%02d", horas, minutos, segundos ));

		//Adicionei esse sysout porque como s�o poucos elemento para adicionar, s� sera poss�vel o resultado 
		//preciso em Miles segundos
		System.out.println("Tempo em Miles Segundos: " + soma);

		//Essa Linha � pra informar a estrutura que t� sendo usada nessa opera��o
		System.out.println("Estrutura de Dados Usada: Lista Duplamente Encadeada");

		System.out.println("Tamanho: " +lde.tamanho());



	}

}
