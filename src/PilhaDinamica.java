public class PilhaDinamica implements PilhaOperacoes {


    private No topo;
    private int tamanho;

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
        tamanho = 0;
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
        tamanho++;
        return valor;
    }

    @Override
    public  int desempilhar() {
        if (estaVazia()) {
            System.out.println("A Pilha Está Vazia!");
            return -1;
        }
        int valor = topo.conteudo;
        topo = topo.proximo;
        tamanho--;
        System.out.println("Item Removido: " + valor);
        return valor;
    }

    @Override
    public int topo() {
        if (estaVazia()) return  -1;
        return topo.conteudo;
    }

    @Override
    public void mostrarTopo() {
        if (estaVazia()) {
            System.out.println("Pilha Vazia" );
            return;
        }
        System.out.println("Topo: " + topo.conteudo );
    }

    @Override
    public void quantidadeElemento() {
        System.out.println("Quantidade de Elementos: " + tamanho);
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
