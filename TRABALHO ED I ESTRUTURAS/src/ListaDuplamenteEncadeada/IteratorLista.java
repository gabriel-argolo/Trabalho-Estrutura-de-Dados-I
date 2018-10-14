package ListaDuplamenteEncadeada;
import java.util.Iterator;

public class IteratorLista<E> implements Iterator<E> {

	@SuppressWarnings("rawtypes")
	NoDuplamenteEncadeado no;


	public IteratorLista(@SuppressWarnings("rawtypes") NoDuplamenteEncadeado no) {
		this.no = no;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (no.getProxima() != null){
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		@SuppressWarnings("unchecked")
		E e = (E) no.getElemento();
		no = no.getProxima();
		return e;
	}

}
