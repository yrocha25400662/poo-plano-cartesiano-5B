/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yanzu
 */
public class Punto {

    /**
     * Clase Punto — modela un punto del plano cartesiano. Subtemas: 2.1
     * (declaración), 2.3 (this), 2.4 (métodos), 2.5 (constructor).
     */
    public class Punto {
// Subtema 2.1 — Atributos privados (encapsulamiento)

        private String etiqueta;
        private int x;
        private int y;
// Subtema 2.5 — Constructor con parámetros

        public Punto(String etiqueta, int x, int y) {
            this.etiqueta = etiqueta; // Subtema 2.3 — this
            this.x = x;
            this.y = y;
        }
// Subtema 2.4 — Métodos de acceso (getters) con retorno de valores

        public String getEtiqueta() {
            return etiqueta;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
// Representación textual: etiqueta(x,y) ej. A(3,-5)

        @Override
        public String toString() {
            return etiqueta + "(" + x + "," + y + ")";
        }
    }
}
