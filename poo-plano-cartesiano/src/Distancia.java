
/**
 * Clase Distancia — calcula la distancia euclidiana entre dos puntos.
 * Recibe objetos de tipo Punto como argumentos del constructor.
 * Subtemas: 2.1, 2.2, 2.3, 2.4, 2.5.
 */
public class Distancia {
// Subtema 2.1 — Atributos privados

    private Punto puntoA; // Objeto como atributo (composición)
    private Punto puntoB;
    private double distancia;
// Subtema 2.5 — Constructor con objetos Punto como parámetros

    public Distancia(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA; // Subtema 2.3 — this
        this.puntoB = puntoB;
        calcular(); // Calcular al construir el objeto
    }
// Subtema 2.4 — Método privado: lógica de cálculo

    private void calcular() {
        double dx = puntoB.getX() - puntoA.getX();
        double dy = puntoB.getY() - puntoA.getY();
        this.distancia = Math.sqrt(dx * dx + dy * dy);
    }
// Subtema 2.4 — Getter con retorno de valor

    public double getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        return "Distancia entre " + puntoA + " y " + puntoB
                + " = " + String.format("%.4f", distancia);

    }
}
