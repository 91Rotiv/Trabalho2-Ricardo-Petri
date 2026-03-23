public class Main {
    public static void main(String[] args) {

        PilhaSimples pilhaSimples = new PilhaSimples(6);

        //pilhaSimples.empilhar(1);
        //pilhaSimples.empilhar(3);
        //pilhaSimples.empilhar(5);
        //pilhaSimples.empilhar(6);
        PilhaDinamica pilhaDinamica = new PilhaDinamica();
        pilhaDinamica.empilhar(1);
        pilhaDinamica.empilhar(2);
        pilhaDinamica.empilhar(5);
        pilhaDinamica.mostrar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.mostrar();

    }
}