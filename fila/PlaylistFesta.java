

package exercicio;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class PlaylistFesta {


   public static void main(String[] args) {
       Queue<String> playlist = new LinkedList<String>();
      
       if (playlist.isEmpty()) {
           System.out.println("A playlist está vazia");
       } else {
           System.out.println("A playlist tem músicas");
       }
       System.out.println("\nResultados das Músicas Inseridas:");
     
       playlist.add("A Laje");
       playlist.add("Cheiro de Amor");
       playlist.add("Praia do Futuro");
      
       if (playlist.isEmpty()) {
           System.out.println("A playlist não tem músicas");
       } else {
           System.out.println("A playlist contém músicas");
       }
       System.out.println("A playlist contém " + playlist.size() + " músicas\n");
      
       playlist.offer("Chuva de Prata");
       System.out.println("Agora a playlist tem " + playlist.size() + " músicas\n");
      
       if (!playlist.isEmpty()) {
           Iterator<String> it = playlist.iterator();
           if (it.hasNext()) {
               System.out.println("Próxima música: " + it.next());
           }
       }
       System.out.println("\nMúsicas Removidas:");
      
       if (playlist.size() > 0) {
           playlist.remove(); 
       }
       System.out.println("A playlist contém " + playlist.size() + " músicas");
      
       playlist.poll();
       System.out.println("A playlist contém " + playlist.size() + " músicas\n");
      
       System.out.println("Músicas restantes na playlist:");
       Iterator<String> it = playlist.iterator();
       while (it.hasNext()) {
           System.out.println(it.next());
       }
   }
}
