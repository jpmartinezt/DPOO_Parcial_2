package logica.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.*;

import java.util.ArrayList;

public class ParcialTest { 
	 // Caso 1: Dos Raíces
    @Test
    void testCalcularRaicesDosRaices() throws Exception {
    	Parcial p1 = new Parcial(3, 30, -72);
        ArrayList<Double> raices = p1.calcularRaices();
        assertEquals(2, raices.size());
        assertTrue(raices.contains(2.0));
        assertTrue(raices.contains(-12.0));
    }

    // Caso 2: Una raíz
    @Test
    void testCalcularRaicesUnaRaiz() throws Exception {
    	Parcial p2 = new Parcial(100, -20, 1);
        ArrayList<Double> raices = p2.calcularRaices();
        assertEquals(1, raices.size());
        assertTrue(raices.contains(0.1));
    }

    // Caso 3: La ecuación no es cuadrática (a = 0)
    @Test
    void testCalcularRaicesNoCuadratica() {
        Parcial p3 = new Parcial(0, 340, 44);
        assertThrows(Exception.class, () -> p3.calcularRaices(), "a no puede ser cero. No es una ecuación cuadrática.");
    }

    // Caso 4: La ecuación no tiene raíces reales (Discriminante negativo)
    @Test
    void testCalcularRaicesCaso4_DiscriminanteNegativo() {
    	Parcial p4 = new Parcial(4.5, 1, 4);
        assertThrows(Exception.class, () -> p4.calcularRaices(), "No existen raíces reales (discriminante negativo).");
    }
}
