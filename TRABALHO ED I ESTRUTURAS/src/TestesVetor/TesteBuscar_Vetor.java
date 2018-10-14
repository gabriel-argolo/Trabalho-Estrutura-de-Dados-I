package TestesVetor;

import Vetor.Vetor;

public class TesteBuscar_Vetor {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();

		long inicio, fim, soma, segundos, horas, minutos;

		// a v�riavel inicio est� sendo usada para cronometrar o tempo de inicio
		inicio = System.currentTimeMillis();

		//Coloque o valor da quantidade de elementos que deseja adicionar na lista aqui logo abaixo:
		long qtdElementos = 20000000;   // Teste realizado com dois milh�es


		//o for esta sendo utilizado para adicionar os elementos no vetor
		for (long i = 0; i < qtdElementos; i++){
			vetor.adiciona(i);
		}

		//Coloque na variavel abaixo o valor do elemento que voc� quer buscar:
		int elementoBuscar=3000000;

		System.out.println(vetor.contem(elementoBuscar));

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

		System.out.println("Tempo Gasto para Busrcar o Elemento: : "+elementoBuscar);

		//Usei o String.format para formatar o resultado em Horas/Minutos/Segundos, com as casas decimais
		System.out.println( String.format("Horas/Minutos/Segundos: "+ "%03d:%02d:%02d", horas, minutos, segundos ));

		//Adicionei esse sysout porque como s�o poucos elemento para adicionar, s� sera poss�vel o resultado 
		//preciso em Miles segundos
		System.out.println("Tempo em Miles Segundos: " + soma);

		//Essa Linha � pra informar a estrutura que t� sendo usada nessa opera��o
		System.out.println("Estrutura de Dados Usada: Vetor");

		System.out.println("Tamanho do Vetor: " +vetor.tamanho());

	}

}
