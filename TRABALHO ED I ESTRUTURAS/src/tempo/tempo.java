package tempo;

import org.omg.PortableServer.ForwardRequestHelper;

public class tempo {
	long inicio, fim, soma, segundos, horas, minutos;

	inicio = System.currentTimeMillis();

	for(long i = 0; i<=qtdElementos; i++) {
		estruturaEscolhida.adiciona(i);

	}

	fim = System.currentTimeMillis();

	soma = fim-inicio;

	segundos = (soma / 100) % 60;
	minutos = (soma / 6000) % 60;
	horas = (soma / 3600000);

	System.out.println(String.format("HORAS:MINUTOS:SEGUNDOS: " +"%03d:%02d:%02d", horas, minutos, segundos));

}