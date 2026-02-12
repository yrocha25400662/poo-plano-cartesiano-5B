/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yanzu
 */
public class MainDistancia {
    public static void main(String[] args) {
// Subtema 2.2 — Instanciación de objetos Punto
Punto puntoA = new Punto("A", 3, -5);
Punto puntoB = new Punto("B", -2, 6);
Punto puntoC = new Punto("C", 0, 0); // Origen
Punto puntoD = new Punto("D", 4, 4);
// Mostrar la representación toString() de cada punto
System.out.println("--- Puntos creados ---");
System.out.println(puntoA); // A(3,-5)
System.out.println(puntoB); // B(-2,6)
System.out.println(puntoC); // C(0,0)
System.out.println(puntoD); // D(4,4)


// Subtema 2.2 — Instanciación de Distancia pasando objetos Punto
// El constructor de Distancia recibe dos objetos Punto como argumentos
Distancia d1 = new Distancia(puntoA, puntoB);
Distancia d2 = new Distancia(puntoC, puntoD);
// Subtema 2.4 — Invocación de métodos y recepción de retorno
System.out.println("\n--- Cálculo de distancias ---");
System.out.println(d1); // toString()
System.out.println(d2);
System.out.printf("Valor numérico d1: %.4f%n", d1.getDistancia());
}
}
