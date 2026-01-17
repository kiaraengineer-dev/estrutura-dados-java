package exercicio;


public class TestandoArvore {
	
	    public static void main(String[] args) {
	        Arvore arvore = new Arvore();
	    
	        arvore.raiz = new No(5);


	        arvore.raiz.esquerda = new No(3);
	        arvore.raiz.esquerda.esquerda = new No(4);


	        arvore.raiz.direita = new No(9);
	        arvore.raiz.direita.esquerda = new No(7);
	        arvore.raiz.direita.direita = new No(11);


	        System.out.print("A- Caminhamento Central In-order: ");
	        arvore.inOrder(arvore.raiz);


	        System.out.print("\nB- Caminhamento Pré-fixado Pre-order: ");
	        arvore.preOrder(arvore.raiz);


	        System.out.print("\nC-Caminhamento Pós-fixado Post-order: ");
	        arvore.postOrder(arvore.raiz);


	        System.out.print("\nD- Nós folhas: ");
	        arvore.mostrarFolhas(arvore.raiz);


	        System.out.println("\n\ne) Pai e seus filhos:");
	        arvore.mostrarPaiFilhos();
	    }
}








