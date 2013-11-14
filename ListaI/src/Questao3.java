/* 1.	Dada uma lista duplamente encadeada L: 
 * Escreva os trechos de c—digo necess‡rios para inserir o No n no final da lista L.*/

public class Questao3 {
	NoDuplo cabeca;
	int quantidade;

	public void addFim(String str) {
		NoDuplo novo = new NoDuplo(str);
		if (cabeca == null) {
			this.cabeca = novo;
			quantidade++;
			return;
		}
		NoDuplo temp = cabeca;
		for (int i = 0; i <= quantidade; i++) {
			temp.getProximo();
		}
		novo.setAnterior(temp);
		temp.setProximo(novo);
		// Formando a Lista Circular :)
		novo.setProximo(cabeca);
		this.quantidade++;
	}
}
