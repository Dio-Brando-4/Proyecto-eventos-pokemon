package Logic;

public class Ataque {
    private string nombre;
    private TipoEnergia tipoEnergia;
    private int costoEnergia;
    private int dañoBase;
    
    public Ataque(string nombre, TipoEnergia tipoEnergia, int costoEnergia, int dañoBase) {
        this.nombre = nombre;
        this.tipoEnergia = tipoEnergia;
        this.costoEnergia = costoEnergia;
        this.dañoBase = dañoBase;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public TipoEnergia getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(TipoEnergia tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public int getCostoEnergia() {
        return costoEnergia;
    }

    public void setCostoEnergia(int costoEnergia) {
        this.costoEnergia = costoEnergia;
    }

    public int getDañoBase() {
        return dañoBase;
    }

    public void setDañoBase(int dañoBase) {
        this.dañoBase = dañoBase;
    }
    

}
