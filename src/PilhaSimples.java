public class PilhaSimples implements PilhaOperacoes{

    private int inicio;
    private int[] itens;

    public PilhaSimples(int tamanho) {
        inicio = -1;
        itens = new int[tamanho];
        System.out.println("Pilha Criada com Sucesso!");
    }

    public boolean estaVazia(){
        return inicio == - 1;
    }

    public boolean estaCheia(){
        return inicio == itens.length - 1;
    }

    public int empilhar(int conteudo) {
        if (estaCheia()) {
            System.out.println("A Pilha Está Cheia! ");
            return -1;
        }
            inicio++;
            itens[inicio] = conteudo;
            return conteudo;
    }

    public int desempilhar() {
        System.out.println("Iten(S) Removido(S)");
        if (estaVazia()) {
            System.out.println("A Pilha Está vazia! ");
            return -1;
        }
        return itens[inicio--];
    }

    public int topo() {
        if (estaVazia()) return -1;
        return itens[inicio];
    }

    @Override
    public void mostrar() {
        for (int i = inicio; i >= 0; i--) {
            System.out.println("Itens na Pilha: " + itens[i]);
        }
    }
}


