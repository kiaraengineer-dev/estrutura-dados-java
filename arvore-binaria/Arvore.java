public class Arvore {
    
    No raiz;
    
    public void inOrder(No no) {
        if (no != null) {
            inOrder(no.esquerda);
            System.out.print("[" + no.valor + "] ");
            inOrder(no.direita);
        }
    }

    public void preOrder(No no) {
        if (no != null) {
            System.out.print("[" + no.valor + "] ");
            preOrder(no.esquerda);
            preOrder(no.direita);
        }
    }

    public void postOrder(No no) {
        if (no != null) {
            postOrder(no.esquerda);
            postOrder(no.direita);
            System.out.print("[" + no.valor + "] ");
        }
    }

    public void mostrarFolhas(No no) {
        if (no != null) {
            if (no.esquerda == null && no.direita == null) {
                System.out.print("[" + no.valor + "] ");
            }
            mostrarFolhas(no.esquerda);
            mostrarFolhas(no.direita);
        }
    }

    public void mostrarPaiFilhos() {
        if (raiz != null) {
            System.out.println("Pai (Raiz): [" + raiz.valor + "]");
            System.out.println("Filho esquerdo: [" + raiz.esquerda.valor + "]");
            System.out.println("Filho direito: [" + raiz.direita.valor + "]");
        }
    }
}
