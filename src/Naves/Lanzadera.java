package Naves;

public class Lanzadera extends Nave{
    int potenciaPropulsion;

    public Lanzadera(String nombre, float peso, int potenciaPropulsion) {
        super(nombre, peso);
        this.potenciaPropulsion = potenciaPropulsion;
    }

    public int getPotenciaPropulsion() {
        return potenciaPropulsion;
    }

    public void setPotenciaPropulsion(int potenciaPropulsion) {
        this.potenciaPropulsion = potenciaPropulsion;
    }

    @Override
    public void despegar() {
        System.out.println("Soy la lanzadera "+getNombre()+ " despegando");
    }
}
