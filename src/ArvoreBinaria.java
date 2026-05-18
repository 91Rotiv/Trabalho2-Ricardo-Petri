public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = new No(null);
        System.out.println("Árvore Binária criada com sucesso!");
    }

//    public void inserir(Integer conteudo) {
//        No novoNo = new No(conteudo);
//
//        if(estaVazia()) {
//            this.raiz = novoNo;
//        } else {
//            No aux = this.raiz;
//            while(true) {
//                if (aux.getConteudo() > novoNo.getConteudo()) {
//                    if (aux.getEsquerda() == null) {
//                        aux.setEsquerda(novoNo);
//                        return;
//                    } else {
//                        aux = aux.getEsquerda();
//                    }
//                } else if (aux.getConteudo().equals(novoNo.getConteudo())) {
//                    System.out.println("Não é possível informar nós repetidos.");
//                    return;
//                } else {
//                    if (aux.getDireita() == null) {
//                        aux.setDireita(novoNo);
//                        return;
//                    } else {
//                        aux = aux.getDireita();
//                    }
//                }
//            }
//        }
//    }

    public void inserir(Integer conteudo) {
        No novoNo = new No(conteudo);

        if(estaVazia()) {
            this.raiz = novoNo;
        } else {
            inserirRecursivo(novoNo, this.raiz);
        }
    }

    public void inserirRecursivo(No novoNo, No atual) {
        if (atual.getConteudo() > novoNo.getConteudo()) {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novoNo);
                System.out.println("O nó " + novoNo.getConteudo() + " foi inserido na Árvore.");
                return;
            } else {
                inserirRecursivo(novoNo, atual.getEsquerda());
            }
        } else if (atual.getConteudo().equals(novoNo.getConteudo())) {
            System.out.println("Não é possível informar nós repetidos.");
            return;
        } else {
            if (atual.getDireita() == null) {
                atual.setDireita(novoNo);
                System.out.println("O nó " + novoNo.getConteudo() + " foi inserido na Árvore.");
                return;
            } else {
                inserirRecursivo(novoNo, atual.getDireita());
            }
        }
    }

    public boolean estaVazia() {
        if(this.raiz.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    private void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getConteudo());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }

    private void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }

    private void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }

    public void remover(Integer conteudo) {
        this.raiz = removerRecursivo(this.raiz, conteudo);
    }

    private No removerRecursivo(No atual, Integer conteudo) {

        if (atual == null) {
            System.out.println("Nó não foi encontrado.");
            return null;
        }

        if (conteudo < atual.getConteudo()) {
            atual.setEsquerda(
                    removerRecursivo(atual.getEsquerda(), conteudo)
            );

        } else if (conteudo > atual.getConteudo()) {
            atual.setDireita(
                    removerRecursivo(atual.getDireita(), conteudo)
            );

        } else {

            if (noFolha(atual)) {
                return removerFolha(atual);
            }

            if (noUmFilho(atual)) {
                return removerUmFilho(atual);
            }
            return removerDoisFilhos(atual);
        }
        return atual;
    }

    private boolean noFolha(No no) {
        return no.getEsquerda() == null &&
                no.getDireita() == null;
    }

    private boolean noUmFilho(No no) {

        if (no.getEsquerda() == null &&
                no.getDireita() != null) {
            return true;
        }

        if (no.getEsquerda() != null &&
                no.getDireita() == null) {
            return true;
        }
        return false;
    }

    private No removerFolha(No no) {
        return null;
    }

    private No removerUmFilho(No no) {

        if (no.getEsquerda() != null) {
            return no.getEsquerda();
        }
        return no.getDireita();
    }

    private No removerDoisFilhos(No no) {

        No sucessor = menorValor(no.getDireita());
        no.setConteudo(sucessor.getConteudo());
        no.setDireita(
                removerRecursivo(
                        no.getDireita(),
                        sucessor.getConteudo()
                )
        );
        return no;
    }

    private No menorValor(No no) {

        No atual = no;

        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual;
    }

    public void exibir(String percurso) {
        switch (percurso){
            case("Pre"):
                preOrdem(this.raiz);
                break;
            case("Em"):
                emOrdem(this.raiz);
                break;
            case("Pos"):
                posOrdem(this.raiz);
                break;
        }
    }
}