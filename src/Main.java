public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(0);
        arvoreBinaria.inserir(-3);
        arvoreBinaria.inserir(-5);
        arvoreBinaria.inserir(-4);
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(3);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(9);

        System.out.println("Árvore original:");
        arvoreBinaria.exibir("Em");

        // REMOÇÃO DE NÓ FOLHA
        System.out.println("Removendo nó folha (-4):");
        arvoreBinaria.remover(-4);
        arvoreBinaria.exibir("Em");

        // REMOÇÃO DE NÓ COM UM FILHO
        System.out.println("Removendo nó com um filho (10):");
        arvoreBinaria.remover(10);
        arvoreBinaria.exibir("Em");

        // REMOÇÃO DE NÓ COM DOIS FILHOS
        System.out.println("Removendo nó com dois filhos (5):");
        arvoreBinaria.remover(5);
        arvoreBinaria.exibir("Em");

    }
}