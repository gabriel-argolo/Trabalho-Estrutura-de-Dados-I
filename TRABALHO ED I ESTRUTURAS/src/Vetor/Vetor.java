package Vetor;

public class Vetor {

	private Object[] objetos = new Object[100];
	private int totalDeObjetos = 0;

	public void adiciona(Object objeto) {
		this.garantaEspaco(); 
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++; 
	}

	public void adiciona(int posicao, Object aluno) { 
		this.garantaEspaco(); 
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida"); 
		}
		for (int i = this.totalDeObjetos - 1; i >= posicao; i--) { 
			this.objetos[i + 1] = this.objetos[i]; 
		}
		this.objetos[posicao] = aluno; this.totalDeObjetos++;
	}


	public Object pega(int posicao) { 
		if (!this.posicaoOcupada(posicao)) { 
			throw new IllegalArgumentException("Posi��o inv�lida");
		} 
		return this.objetos[posicao]; 
	}



	public void remove(int posicao) { 
		if (!this.posicaoOcupada(posicao)) { 
			throw new IllegalArgumentException("Posi��o inv�lida");
		} 
		for (int i = posicao; i < this.totalDeObjetos - 1; i++) { 
			this.objetos[i] = this.objetos[i + 1];
		} 
		this.totalDeObjetos--; 
	}


	public boolean contem(Object elemento) {
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (elemento.equals(this.objetos[i])) {
				return true; 
			}
		} return false;
	}


	public int tamanho() { 
		return this.totalDeObjetos;
	}


	private boolean posicaoOcupada(int posicao) { 
		return posicao >= 0 && posicao < this.totalDeObjetos; 
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeObjetos; 
	}

	private void garantaEspaco() { 
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2]; 
			for (int i = 0; i < this.objetos.length; i++) {
				novaArray[i] = this.objetos[i]; 
			}
			this.objetos = novaArray; } }
}