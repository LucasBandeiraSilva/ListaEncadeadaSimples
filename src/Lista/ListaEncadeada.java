package Lista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;
    private No<T> ultimo;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public No<T> get(int posicao) {
        No<T> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual.getProximo();
            }
        }
        return atual;
    }

    public void remover(T elemento) {
        No anterior = null;
        No atual = this.inicio;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getElemento().equals(elemento)) {
                if (this.tamanho == 1) {
                    this.inicio = null;
                    this.ultimo = null;
                } else if (atual == inicio) {
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    this.tamanho--;
                    break;

            }
            anterior = atual;
            atual = this.inicio;
        }
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

    public int getTamanho() {
        return tamanho;
    }

}