import Logic.TipoEnergia;

public class App {
    public static void main(String[] args) {
        for (TipoEnergia t : TipoEnergia.values()) {
            System.out.println(t + " " + t.getSimbolo());;
        }
    }
}