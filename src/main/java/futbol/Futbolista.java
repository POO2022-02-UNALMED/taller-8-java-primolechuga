package futbol;
public abstract class Futbolista implements Comparable{
    private String nombre;
    private int edad;
    private final String posicion;
    public Futbolista(String nombre, int edad, String posicion){
        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
    }
    public Futbolista(){
        this("Maradona",30,"delantero");
    
    }@Override
    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
    public abstract boolean jugarConLasManos();
    public String toString(){
        return ("El futbolista "+this.nombre+" tiene "+this.edad+", y juega de "+this.posicion);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public String getPosicion() {
        return posicion;
    }
    @Override
    public int compareTo(Object arg0) {
        return 0;
    }

}