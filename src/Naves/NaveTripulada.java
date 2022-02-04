package Naves;

public class NaveTripulada extends Nave{
    int cantTripulantes;

    public NaveTripulada(String nombre, float peso, int cantTripulantes) {
        super(nombre, peso);
        this.cantTripulantes = cantTripulantes;
    }

    public int getCantTripulantes() {
        return cantTripulantes;
    }

    public void setCantTripulantes(int cantTripulantes) {
        this.cantTripulantes = cantTripulantes;
    }

    @Override
    public void despegar() {
        System.out.println("Soy la nave tripulada "+getNombre()+ " despegando");
    }
}
