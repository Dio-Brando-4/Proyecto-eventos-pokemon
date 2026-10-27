package Logic;

public enum TipoEnergia {
    FUEGO("🔥"), 
    AGUA("💧"), 
    ELECTRICO("⚡"), 
    PSIQUICO("😍"), 
    INCOLORO("🤣");

    private final String simbolo;

    String Hola = "hola";

    TipoEnergia(String simbolo) {
    this.simbolo = simbolo;
    }
    public String getSimbolo(){
        return simbolo;
    }
}