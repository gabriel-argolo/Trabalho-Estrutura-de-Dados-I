package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada implements Iterable<Object> {

	@SuppressWarnings("rawtypes")
	private NoDuplamenteEncadeado primeira;
	@SuppressWarnings("rawtypes")
	private NoDuplamenteEncadeado ultima;
	private int totalDeElementos;


	@SuppressWarnings("rawtypes")
	public void adicionaNoFim(Object elemento) { 
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento); 
		} else {
			NoDuplamenteEncadeado nova = new NoDuplamenteEncadeado(elemento); 
			this.ultima.setProxima(nova); 
			nova.setAnterior(this.ultima); 
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
			} else { 
				@SuppressWarnings("rawtypes")
				NoDuplamenteEncadeado anterior = this.pegaElemento(posicao - 1);
				@SuppressWarnings("rawtypes")
				NoDuplamenteEncadeado proxima = anterior.getProxima();
				@SuppressWarnings("rawtypes")
				NoDuplamenteEncadeado nova = new NoDuplamenteEncadeado(anterior.getProxima(), elemento);
				nova.setAnterior(anterior); 
				anterior.setProxima(nova);
				proxima.setAnterior(nova); 
				this.totalDeElementos++;
			}
	}


	private boolean posicaoOcupada(int posicao){ 
		return posicao >= 0 && posicao < this.totalDeElementos; 
	}


	@SuppressWarnings("rawtypes")
	private NoDuplamenteEncadeado pegaElemento(int posicao) { 
		if(!this.posicaoOcupada(posicao)){ 
			throw new IllegalArgumentException("Posição não existe");
		}
		NoDuplamenteEncadeado atual = primeira; 
		for (int i = 0; i < posicao; i++) { 
			atual = atual.getProxima();
		}
		return atual;
	}



	public Object pega(int posicao) {
		return this.pegaElemento(posicao).getElemento();

	}

	public void removePorPosicao(int posicao) { 
		if (!this.posicaoOcupada(posicao)) { 
			throw new IllegalArgumentException("Posição não existe");
		}

		if (posicao == 0) {
			this.removeDoComeco(); 
		} 
		else 
			if (posicao == this.totalDeElementos - 1) { 
				this.removeDoFim(); 
			}
			else 
			{
				@SuppressWarnings("rawtypes")
				NoDuplamenteEncadeado anterior = this.pegaElemento(posicao - 1); 
				@SuppressWarnings("rawtypes")
				NoDuplamenteEncadeado atual = anterior.getProxima(); 
				@SuppressWarnings("rawtypes")
				NoDuplamenteEncadeado proxima = atual.getProxima();
				anterior.setProxima(proxima); 
				proxima.setAnterior(anterior);
				this.totalDeElementos--;
			}

	}

	public int tamanho() { 

		return this.totalDeElementos;

	}

	public boolean contem(Object elemento) {
		@SuppressWarnings("rawtypes")
		NoDuplamenteEncadeado atual = this.primeira;
		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true; 
			} 
			atual = atual.getProxima();
		}
		return false;

	}


	public void adicionaNoComeco(Object elemento) {
		if(this.totalDeElementos == 0){
			@SuppressWarnings("rawtypes")
			NoDuplamenteEncadeado nova = new NoDuplamenteEncadeado(elemento); 
			this.primeira = nova; this.ultima = nova; 
		} 
		else { 
			@SuppressWarnings("rawtypes")
			NoDuplamenteEncadeado nova = new NoDuplamenteEncadeado(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova; 
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
			this.ultima = null; }

	}

	public void removeDoFim() { 
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) { 
			throw new IllegalArgumentException("Posição não existe"); 
		} 
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} 
		else {
			@SuppressWarnings("rawtypes")
			NoDuplamenteEncadeado penultima = this.ultima.getAnterior();
			penultima.setProxima(null); 
			this.ultima = penultima; 
			this.totalDeElementos--; }

	}


	@SuppressWarnings("rawtypes")
	public void imprimir(){

		if (this.totalDeElementos == 0){
			System.out.println("[ ]" + " - A lista está vazia");
		}else{
			System.out.print("[");
			NoDuplamenteEncadeado aux = this.primeira;
			for (int i=0; i< this.totalDeElementos-1; i++){
				System.out.print(aux.getElemento()+", ");
				aux=aux.getProxima();
			}
			System.out.println(aux.getElemento()+"]");
		}
	}

	@Override
	public java.util.Iterator<Object> iterator() {

		// TODO Auto-generated method stub
		return null;
	}


}
