public class Encadeada<E> implements IListAluno {

	private No<E> primeiro;
	private int size;

	@Override
	public void add(Aluno a) {
		addPos(a, 0);
	}

	@Override
	public void addEnd(Aluno a) {
		addPos(a, size);
	}

	@Override
	public void addPos(Aluno a, int pos) {
		if (this.primeiro == null || pos == 0) {
			this.primeiro = new No<E>(a, this.primeiro);
		} else {
			No<E> temp = this.primeiro;
			for (int i = 0; i < pos; i++) {
				temp = temp.getProximo();
			}
			temp.setProximo(new No<E>(a, temp.getProximo()));
		}
		this.size++;
	}

	@Override
	public Aluno get(int pos) {
		if ((pos < 0) || (pos >= size)) {
			throw new IndexOutOfBoundsException();
		}
		No<E> temp = this.primeiro;
		for (int i = 0; i < pos; i++) {
			temp = temp.getProximo();
		}
		return temp.getObjeto();
	}

	@Override
	public Aluno removerInicio() {
		return this.removePos(0);
	}

	@Override
	public Aluno removeEnd() {
		return this.removePos(size);

	}

	@Override
	public Aluno removePos(int pos) {
		if ((pos < 0) || (pos > this.size)) {
			throw new IndexOutOfBoundsException();
		}
		int tam = this.size;
		this.size--;
		Aluno removido;

		if (pos == 0) {
			removido = this.primeiro.getObjeto();
			this.primeiro = this.primeiro.getProximo();
			return removido;
		}
		No<E> aux = this.primeiro;

		for (int i = 0; i < pos - 1; i++) {
			aux = aux.getProximo();
		}

		if (pos == tam - 1) {
			removido = aux.getProximo().getObjeto();
			aux.setProximo(null);
			return removido;
		}

		No<E> remover = aux.getProximo();
		removido = remover.getObjeto();
		aux.setProximo(remover.getProximo());
		return removido;
	}

	@Override
	public boolean contains(Aluno a) {
		while (primeiro.getProximo() != null) {
			if (primeiro.getObjeto().equals(a)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int size() {
		return this.size;
	}
}
