
package ArrayList;
import java.util.ArrayList;
/**
 * @author Estudiante
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    //Agragacion
    public boolean addJugadorA (Jugador jugador){
        return this.jugadores.add(jugador);
    }
    
    //Composicion: crear metodo dentro del todo que agregue el objeto...no en el main
    public boolean addJugadorC (String n){
        Jugador j = new Jugador(n);
        return this.jugadores.add(j);
    }
    
}
