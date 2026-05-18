A implementação da remoção foi feita de forma porque a estrutura da árvore binária é naturalmente recursiva, pois cada nó possui subárvores
esquerda e direita. Dessa forma, é possível percorrer a árvore de maneira mais organizada e com menor complexidade de código; a abordagem
recursiva também facilita o tratamento dos diferentes casos de remoção(No Folha, No UM Filho e No Dois Filhos)
Na parte de No com dois filhos, foi utilizada a estratégia do sucessor, que consiste em localizar o menor elemento da subárvore direita
(“menor dos maiores”), conforme aprendido em sala de aula.
