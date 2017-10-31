package filaDinamica;

public class NoFila {

    private Object item;
    private NoFila prox;

    public NoFila(Object item) {
        this.item = item;
        this.setProx(null);
    }


    public NoFila percorreNo(){
        if (this.getProx() == null) return this;
        return this.getProx().percorreNo();
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public NoFila getProx() {
        return prox;
    }

    public void setProx(NoFila prox) {
        this.prox = prox;
    }
}
