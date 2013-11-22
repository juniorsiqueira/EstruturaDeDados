
public class No<E> {

	private No<E> proximo;
    private Aluno objeto;
    
    public No(Aluno o){
            this.setObjeto(o);
    }
    
    public No(Aluno o, No<E> proximo){
            this.objeto = o;
            this.proximo = proximo;
    }

    public No<E> getProximo() {
            return proximo;
    }

    public void setProximo(No<E> proximo) {
            this.proximo = proximo;
    }

    public Aluno getObjeto() {
            return objeto;
    }

    public void setObjeto(Aluno o) {
            this.objeto = o;
    }
   }
