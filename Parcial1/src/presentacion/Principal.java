package presentacion;

import logica.*;

import java.util.ArrayList;

public class Principal {

    // Constructor con todos los casos
    public Principal() {
    	// Caso 1: ecuación con dos raíces.
        try {
            Parcial p1 = new Parcial(1, -3, 2); // x^2 - 3x + 2 = 0
            ArrayList<Double> r1 = p1.calcularRaices();
            System.out.println("Caso 1: Ecuación x^2 - 3x + 2 = 0 -> " + r1);
        } catch (Exception e) {
            System.out.println("Caso 1: Ecuación x^2 - 3x + 2 = 0 -- " + e.getMessage());
        }

        // Caso 2: ecuación con una sola raíz (discriminante cero)
        try {
            Parcial p2 = new Parcial(1, -2, 1); // x^2 - 2x + 1 = 0
            ArrayList<Double> r2 = p2.calcularRaices();
            System.out.println("Caso 2: Ecuación x^2 - 2x + 1 = 0 -> " + r2);
        } catch (Exception e) {
            System.out.println("Caso 2: Ecuación x^2 - 2x + 1 = 0 -- " + e.getMessage());
        }

        // Caso 3: La ecuación no es cuadrática (a = 0)
        try {
            Parcial p3 = new Parcial(0, 4, 5);
            ArrayList<Double> r3 = p3.calcularRaices();
            System.out.println("Caso 3: Ecuación 4x + 5 = 0 -> " + r3);
        } catch (Exception e) {
            System.out.println("Caso 3: Ecuación 4x + 5 = 0 -- " + e.getMessage());
        }

        // Caso 4: Discriminante negativo. Es decir, raíces complejas.
        try {
            Parcial p4 = new Parcial(1, 2, 5);
            ArrayList<Double> r4 = p4.calcularRaices();
            System.out.println("Caso 4: Ecuación x^2 + 2x + 5 = 0 ->" + r4);
        } catch (Exception e) {
            System.out.println("Caso 4: Ecuación x^2 + 2x + 5 = 0 -- " + e.getMessage());
        }
    }

    // Método main, como hacemos en clase.
    public static void main(String[] args) {
        new Principal();
    }
}
