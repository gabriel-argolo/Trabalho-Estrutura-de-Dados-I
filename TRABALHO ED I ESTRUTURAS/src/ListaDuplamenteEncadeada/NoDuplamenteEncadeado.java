package ListaDuplamenteEncadeada;

import java.util.Iterator;

public class NoDuplamenteEncadeado<E> implements Iterator <E>{

	@SuppressWarnings("rawtypes")
	private NoDuplamenteEncadeado proxima;
	@SuppressWarnings("rawtypes")
	private NoDuplamenteEncadeado anterior;
	private Object elemento;

	public NoDuplamenteEncadeado(@SuppressWarnings("rawtypes") NoDuplamenteEncadeado proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento; 
	}

	public NoDuplamenteEncadeado(Object elemento) { 
		this.elemento = elemento; 
	}

	@SuppressWarnings("rawtypes")
	public NoDuplamenteEncadeado getProxima() {
		return proxima;
	}

	@SuppressWarnings("rawtypes")
	public void setProxima(NoDuplamenteEncadeado proxima) {
		this.proxima = proxima;
	}

	@SuppressWarnings("rawtypes")
	public NoDuplamenteEncadeado getAnterior() {
		return anterior;
	}

	@SuppressWarnings("rawtypes")
	public void setAnterior(NoDuplamenteEncadeado anterior) {
		this.anterior = anterior;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	@Override
	public boolean hasNext() {
		if (this.getProxima() != null){
			return true;
		}
		return false;
	}

	@SuppressWarnings({ "unchecked", "null" })
	@Override
	public E next() {
		E e = (E) this.getElemento();
		NoDuplamenteEncadeado<E> no = null;
		no = no.getProxima();
		return e;
	}



}

