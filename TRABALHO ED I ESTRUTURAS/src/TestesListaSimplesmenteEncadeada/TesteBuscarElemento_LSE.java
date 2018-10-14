package TestesListaSimplesmenteEncadeada;

import ListaSimplesmenteEncadeada.ListaSimplesmenteEncadeada;

//Teste feito como requisito da M.E de Estrutura de Dados, ministrada pelo Doutor Rafael Vasconcelos
// Grupo: Gabriel Souza, Gabriel Cavalheiro e Marcus Vínicius
// Algoritimo para ver o tempo que leva para buscar um determinado elemento na Estrutura Lista Simplesmente Encadeada

public class TesteBuscarElemento_LSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimplesmenteEncadeada lse = new ListaSimplesmenteEncadeada();

		long inicio, fim, soma, segundos, horas, minutos;

		// a váriavel inicio está sendo usada para cronometrar o tempo de inicio
		inicio = System.currentTimeMillis();

		//o for esta sendo utilizado para adicionar os elementos 
		for (long i = 0; i < 20000000; i++){
			lse.adicionaNoComeco(i);
		}

		int elementoDesejado = 30000000;

		//Usei o for para percorrer o tamanho da lista e verificar se o elemento existe ou não
		// Se o valor existir vai retornar "Elemento Existe" e se não existe vai não vai retornar nada
		for (int i = 0; i<=lse.tamanho(); i++ ){

			int elemento = i;
			if (elemento == elementoDesejado){
				System.out.println("Elemento Existe: " + elementoDesejado);
				break;
			}

		}



		// a váriavel fim está sendo usada para cronometrar o tempo em que o algoritmo levou para adicionar 
		// os elementos
		fim = System.currentTimeMillis();

		// essa soma é feita para ver o tempo total gasto (O resultado é em Miles Segundos
		soma= fim-inicio;

		// Calculo para converter miles segundos em "segundos"
		segundos = ( soma / 1000 ) % 60;      // se não precisar de segundos, basta remover esta linha.

		// Calculo para converter miles segundos em "Minutos"
		minutos  = ( soma / 60000 ) % 60;     // 60000   = 60 * 1000

		// Calculo para converter miles segundos em "Horas"
		horas    = soma / 3600000;            // 3600000 = 60 * 60 * 1000

		System.out.println("Tempo Gasto para Buscar o Elemento: "+elementoDesejado);

		//Usei o String.format para formatar o resultado em Horas/Minutos/Segundos, com as casas decimais
		System.out.println( String.format("Horas/Minutos/Segundos: "+ "%03d:%02d:%02d", horas, minutos, segundos ));

		//Adicionei esse sysout porque como são poucos elemento para adicionar, só sera possível o resultado 
		//preciso em Miles segundos
		System.out.println("Tempo em Miles Segundos: " + soma);

		//Essa Linha é pra informar a estrutura que tá sendo usada nessa operação
		System.out.println("Estrutura de Dados Usada: Lista Simplesmente Encadeada");

		System.out.println("Tamanho da Lista: " + lse.tamanho());
	}

}
