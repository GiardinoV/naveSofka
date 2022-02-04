package Naves;

public class NaveNoTripulada extends Nave{
    String mision;

    public NaveNoTripulada(String nombre, float peso, String mision) {
        super(nombre, peso);
        this.mision = mision;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    @Override
    public void despegar() {
        System.out.println("Soy la nave no tripulada "+getNombre()+ " despegando");
    }
}
