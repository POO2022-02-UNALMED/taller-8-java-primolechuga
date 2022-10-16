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
    @Override
    public int compareTo(Object arg0) {
        return abs(this.getEdad()-((Futbolista)arg0).getEdad);
    }
    @Override
    public boolean jugarConLasManos() {return false;}
    @Override
    public String toString() {
        return super.toString()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados;
    }
}