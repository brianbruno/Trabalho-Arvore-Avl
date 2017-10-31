package filaDinamica;

public class FilaDinamica {

    private NoFila cabeca=null;
    private NoFila cauda=null;

    public FilaDinamica() {
        cabeca = new NoFila(-1);
        cauda = new NoFila(-1);
    }

    public boolean filaVazia(){
        if (cabeca.getProx() == null) return true;
        return false;
    }

    public void enfileira(Object id){
        NoFila no = new NoFila(id);
        if(filaVazia()){
            cabeca.setProx(no);
            cauda.setProx(no);
        } else {
            cauda.getProx().setProx(no);
            cauda.setProx(no);
        }
    }

    public Object desenfileira(){
        Object removido = cabeca.getProx().getItem();
        if (!filaVazia()) cabeca.setProx(cabeca.getProx().getProx());
        return removido;
    }

    public void escreve(){
        System.out.print("[ ");
        escreve(this.getCabeca().getProx());
        System.out.print(" ]\n");
    }

    public void escreve(NoFila no){
        if (filaVazia()) return;
        System.out.print(no.getItem());
        if (no.getProx() == null) return;
        System.out.print(" | ");
        escreve(no.getProx());
    }

    public NoFila percorre(){
        return cabeca.percorreNo();
    }

    public NoFila getCabeca() {
        return cabeca;
    }

    public NoFila getCauda() {
        return cauda;
    }

}
