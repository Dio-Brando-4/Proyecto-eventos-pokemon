package Logic;

public abstract class Carta {
    private string nombre;
    
    public Carta(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }

    
}
