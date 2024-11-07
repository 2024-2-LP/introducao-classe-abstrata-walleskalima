package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura){
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaTotal = 0.0;

        for (Figura figura : figuras) {
           somaTotal += figura.calcularArea();
        } return somaTotal;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasAreaMaiorQue20 = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20){
                figurasAreaMaiorQue20.add(figura);
            }
        }
        return figurasAreaMaiorQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> figurasQuadradas = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                figurasQuadradas.add(figura);
            }
        } return figurasQuadradas;
    }





}
