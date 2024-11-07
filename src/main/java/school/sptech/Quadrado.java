package school.sptech;

public class Quadrado extends Figura {

    private Double lado;

    @Override
    public Double calcularArea() {
        Double areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
