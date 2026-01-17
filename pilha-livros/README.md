
import java.util.Scanner;
import java.util.Stack;
public class PilhaLivros {
	
	  public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        Stack<String> pilhaLivros = new Stack<>();
	        int opcao;
	        do {
	            System.out.println("\n BEM-VINDO BIBLIOTECA DIGITAL ");
	            System.out.println("\n QUAL OPÇÃO DESEJA?");
	            System.out.println("1 - Inserir livro na pilha");
	            System.out.println("2 - Consulta de pilha");
	            System.out.println("3 - Remover livro do topo");
	            System.out.println("4 - Esvaziar pilha");
	            System.out.println("5 - Sair");
	            opcao = scanner.nextInt();
	            scanner.nextLine();
	            switch (opcao) {
	           
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = scanner.nextLine();
	                    pilhaLivros.push(livro);
	                    System.out.println("Livro \"" + livro + "\" Livro adicionado!");
	                    break;
	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia!");
	                       
	                    } else {
	                        System.out.println("Livros na pilha:");
	                       
	                        for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
	                            System.out.println((pilhaLivros.size() - i) + pilhaLivros.get(i));
	                        }
	                    }
	                   
	                    break;
	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println(" Nada para remover, pilha vazia.");
	                       
	                    } else {
	                        String removido = pilhaLivros.pop();
	                        System.out.println(" Livro removido do topo: " + removido);
	                    }
	                   
	                    break;
	                case 4:
	                    pilhaLivros.clear();
	                    System.out.println(" Pilha esvaziada");
	                    break;
	                case 5:
	                    System.out.println(" Voce saiu do programa!");
	                    break;
	                default:
	                    System.out.println("Opção inválida");
	            }
	        } while (opcao != 5);
	    }
	}
