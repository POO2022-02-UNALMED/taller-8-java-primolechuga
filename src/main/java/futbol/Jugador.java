package futbol;
public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;
    public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal){
        super(nombre,edad,posicion);
        this.dorsal=dorsal;
        this.golesMarcados=golesMarcados;
    }
    public Jugador(){
        this("Maradona",30,"delantero",(short)289,(byte)7);
    }
    public int compareTo(Futbolista arg0) {
        int edad1=this.getEdad();
        int edad2=arg0.getEdad();
        return Math.abs(edad1-edad2);
    }
    @Override
    public boolean jugarConLasManos() {return false;}
    @Override
    public String toString() {
        return super.toString()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados;
    }
}