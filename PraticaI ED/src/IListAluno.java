
/* Interface que define as ações de uma Lista.
 */
public interface IListAluno {
	// Adiciona o aluno no inicio da lista
	public void add(Aluno a);

	// Adiciona o aluno no final da lista
	public void addEnd(Aluno a);

	// Adiciona o aluno na posição p da lista
	public void addPos(Aluno a, int pos);

	// Retorna o aluno da posição p da lista
	public Aluno get(int pos);

	// Remove o aluno do inicio da lista
	public Aluno removerInicio();

	// Remove o aluno do final da lista
	public Aluno removeEnd();

	// Remove o aluno da posição p da lista
	public Aluno removePos(int pos);

	// Verifica se o aluno pertence a lista
	public boolean contains(Aluno a);

	// Informa o número de alunos na lista
	public int size();
}
