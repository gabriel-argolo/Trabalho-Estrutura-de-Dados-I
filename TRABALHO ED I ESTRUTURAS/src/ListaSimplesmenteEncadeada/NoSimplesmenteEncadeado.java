package ListaSimplesmenteEncadeada;

public class NoSimplesmenteEncadeado {

	private NoSimplesmenteEncadeado proxima;
	private Object elemento;

	public NoSimplesmenteEncadeado(NoSimplesmenteEncadeado proxima, Object elemento) {
		this.proxima = proxima; 
		this.elemento = elemento; }


	public NoSimplesmenteEncadeado(Object elemento) {
		this.elemento = elemento; 
	}


	public void setProxima(NoSimplesmenteEncadeado proxima) {
		this.proxima = proxima; 
	}


	public NoSimplesmenteEncadeado getProxima() { 
		return proxima; }


	public Object getElemento() { 
		return elemento; 
	}


}
