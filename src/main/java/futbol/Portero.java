package futbol;
public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre,int edad,short golesRecibidos, byte dorsal){
        super(nombre,edad,"portero");
        this.golesRecibidos=golesRecibidos;
        this.dorsal=dorsal;
    }
    public Portero(){
        this("Manolito",12,(short)13,(byte)07);
    }
    @Override
    public String toString() {
        return super.toString()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
    }
    @Override
    public boolean jugarConLasManos() {
        return true;
    }
    @Override
    public int compareTo(Object arg0){
        int goles= this.golesRecibidos;
        int goles2=((Futbolista)arg0).golesRecibidos;
        return Math.abs(goles-goles2);
    }

}