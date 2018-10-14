package ListaSimplesmenteEncadeada;

public class ListaSimplesmenteEncadeada {
	private NoSimplesmenteEncadeado primeira;
	private NoSimplesmenteEncadeado ultima;

	private int totalDeElementos;


	public void adicionaNoFim(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento); 
		} else { 
			NoSimplesmenteEncadeado nova = new NoSimplesmenteEncadeado(elemento); 
			this.ultima.setProxima(nova); 
			this.ultima = nova; 
			this.totalDeElementos++; 
		}
	}



	public void adicionaPorPosicao(int posicao, Object elemento) {
		if(posicao == 0){ 
			// No começo. 

			this.adicionaNoComeco(elemento);
		} else 
			if(posicao == this.totalDeElementos){ 
				// No fim. 
				this.adicionaNoFim(elemento);
			} else
			{ NoSimplesmenteEncadeado anterior = this.pegaPosicao(posicao - 1);
			NoSimplesmenteEncadeado nova = new NoSimplesmenteEncadeado(anterior.getProxima(), elemento);
			anterior.setProxima(nova); 
			this.totalDeElementos++; }
	}




	public void adicionaNoComeco(Object elemento) {
		NoSimplesmenteEncadeado nova = new NoSimplesmenteEncadeado(this.primeira, elemento);
		this.primeira = nova;

		if(this.totalDeElementos == 0){ 
			// caso especial da lista vazia 
			this.ultima = this.primeira; 
		} 
		this.totalDeElementos++;
	}



	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) { 

			throw new IllegalArgumentException("Posição não existe");
		}
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}

	} 


	public void removeDoFim() {

	}


	public Object pega(int posicao) {
		System.out.println(pegaPosicao(posicao).getElemento());
		return this.pegaPosicao(posicao).getElemento();
	}


	public void remove(int posicao){}


	public int tamanho() {


		return this.totalDeElementos;

	}


	public boolean contem(Object elemento) {
		NoSimplesmenteEncadeado atual = this.primeira;

		while (atual != null) { 
			if (atual.getElemento().equals(elemento)) { 
				return true; 
			}
			atual = atual.getProxima(); 
		}
		return false;


	}


	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.totalDeElementos; 
	}


	private NoSimplesmenteEncadeado pegaPosicao(int posicao) {
		if(!this.posicaoOcupada(posicao)){ 
			throw new IllegalArgumentException("Posição não existe"); 
		}
		NoSimplesmenteEncadeado atual = primeira; 
		for (int i = 0; i < posicao; i++) { 
			atual = atual.getProxima(); 
		} 
		return atual;
	}



	public String toString() {
		// Verificando se a Lista está vazia 

		if(this.totalDeElementos == 0){ 
			return "[]"; 
		}

		StringBuilder builder = new StringBuilder("["); 
		NoSimplesmenteEncadeado atual = primeira;

		// Percorrendo até o penúltimo elemento.

		for (int i = 0; i < this.totalDeElementos - 1; i++) { 
			builder.append(atual.getElemento()); 
			builder.append(", "); 
			atual = atual.getProxima(); 
		}
		// último elemento

		builder.append(atual.getElemento()); 
		builder.append("]");

		return builder.toString();
	}


	public void imprimir(){

		if (this.totalDeElementos == 0){
			System.out.println("[ ]" + " - A lista está vazia");
		}else{
			System.out.print("[");
			NoSimplesmenteEncadeado aux = this.primeira;
			for (int i=0; i< this.totalDeElementos-1; i++){
				System.out.print(aux.getElemento()+", ");
				aux=aux.getProxima();
			}
			System.out.println(aux.getElemento()+"]");
		}
	}
}
