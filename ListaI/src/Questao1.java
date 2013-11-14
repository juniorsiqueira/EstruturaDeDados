public class Questao1 {

	int tamanho;
	No cabeca;
	No cauda;

	public void addOrdenado(int num) {
		No novo = new No(num);

		if (cabeca == null) {
			novo.setProximo(cabeca);
			cabeca = novo;
			tamanho++;

			if (cabeca != null) {
				cauda = novo;
			}
			return;
		}
		No aux1 = cabeca;
		No aux2 = cabeca;

		for (int i = 0; i < tamanho; i++) {
			if (aux2.getValor() < novo.getValor()) {
				aux1 = aux2;
				aux2 = aux1.getProximo();
			}
		}
		if (aux2 == cabeca) {
			novo.setProximo(cabeca);
			cabeca = novo;
			tamanho++;

			if (cabeca != null) {
				cauda = novo;
			};
		} else {
			novo.setProximo(aux2);
			aux1.setProximo(novo);
			tamanho++;

		}

	}

	public void imprimir() {
		String str = "";
		No aux = cabeca;
		for (int i = 0; i < tamanho; i++) {
			str += aux.getValor() + " ";
			aux = aux.getProximo();
		}
		System.out.print(str);
	}

}
