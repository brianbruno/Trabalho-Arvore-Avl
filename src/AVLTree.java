import filaDinamica.*;

class NoAVL{
    int chave;
    private NoAVL esq;
    private NoAVL dir;

    public NoAVL() {
        setChave(-1);
        setDir(null);
        setEsq(null);
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public NoAVL getEsq() {
        return esq;
    }

    public void setEsq(NoAVL esq) {
        this.esq = esq;
    }

    public NoAVL getDir() {
        return dir;
    }

    public void setDir(NoAVL dir) {
        this.dir = dir;
    }
}

public class AVLTree {

    private NoAVL raiz;

    public AVLTree() {
        raiz = new NoAVL();
    }

    public boolean arvoreVazia(){
        if (this.raiz == null) return true;
        return false;
    }

    public void insere(int chave){

        if (arvoreVazia()){
            raiz.setChave(chave);
        }
        else {
            if (this.getFatorBalanceamento() == 2){
                //rotacionar esquerda
            } else if (this.getFatorBalanceamento() == -2){
                //rotacionar direita
            }
        }

    }

    public int getFatorBalanceamento() {
        return this.alturaDir() - alturaEsq();
    }


    public int alturaEsq(){
        return getAltura(this.raiz.getEsq());
    }

    public int alturaDir(){
        return getAltura(this.raiz.getDir());
    }

    private int getAltura(NoAVL no){
        if(no == null){
            return 0;
        }
        int altEsq = getAltura(no.getEsq());
        int altDir = getAltura(no.getDir());
        if(altEsq > altDir){
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }


}
