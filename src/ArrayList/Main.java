
package ArrayList;
import java.util.ArrayList;

/**
 * @author Estudiante
 */

public class Main {
    
    public static void main (String[] args){
        Equipo e= new Equipo("E");
        Jugador j = new Jugador ("V");
        boolean resultado = e.addJugadorA(j);
        
        if (resultado == true){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }

        ArrayList<Jugador> lista = e.getJugadores();
        for(Jugador jugador : lista){
            System.out.println(jugador.getNombre());
        }
        
        for(int i=0; i<lista.size(); i++){
            Jugador jugador = lista.get(i);
            System.out.println(jugador.getNombre());
        }
        
       
        //El método toString NO es para imprimir datos...siempre los metodos que imprimen datos van en el main. 
        //El toString convierte el objeto en texto. Convierte la ubicacion en memoria del objeto en texto.
    }
}
