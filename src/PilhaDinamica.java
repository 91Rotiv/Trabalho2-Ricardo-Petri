public class PilhaDinamica implements PilhaOperacoes {

    private No topo;

    private class No {
        int conteudo;
        No proximo;

        public No(int conteudo) {
            this.conteudo = conteudo;
            this.proximo = null;
        }
    }

    public PilhaDinamica() {
        topo = null;
        System.out.println("Pilha Dinâmica Criada! ");
    }

    @Override
    public boolean estaVazia() {
        return topo == null;
    }
    @Override
    public boolean estaCheia() {
        return false;
    }

    @Override
    public int empilhar(int valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
        return valor;
    }

    @Override
    public  int desempilhar() {
        System.out.println("Item(s) Removido(s)!");
        if (estaVazia()) {
            System.out.println("A Pilha Está Vazia!");
            return -1;
        }
        int valor = topo.conteudo;
        topo = topo.proximo;
        return valor;
    }

    @Override
    public int topo() {
        if (estaVazia()) return  -1;
        return topo.conteudo;
    }

    @Override
    public void mostrar() {
        No atual = topo;
        while (atual != null) {
            System.out.println("Item: " + atual.conteudo);
            atual = atual.proximo;
        }
    }
}
