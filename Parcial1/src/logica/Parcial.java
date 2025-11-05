package logica;

import java.util.ArrayList;

//INSTRUCCIONES:
//1. La clase Parcial es una clase de ecuación de segundo orden.
//2. Por eso tiene los atributos a, b y c (Coeficientes, que caracterizan a una ecuación de este tipo)
//3. Por eso tiene los servicios calcularDiscriminante() y calcularRaices()
//4. Para crear una ecuación, debe crear una instancia de la clase Parcial con los coeficientes como parámetro.
//5. Se prueban casos en la clase principal. Si se quiere añadir casos, añadirlos a esa clase.
//6. La clase tiene 100% cobertura por los tests. Correr el archivo en la carpeta "tests" para confirmar.

public class Parcial {
	private double a;
	private double b;
	private double c;
	
	public Parcial(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calcularDiscriminante() {
		return this.b * this.b - 4 * this.a * this.c;
	}
	
	public ArrayList<Double> calcularRaices () throws Exception{
        // Validación 1: La ecuación debe ser cuadrática.
    	if (this.a == 0) {
            throw new Exception("Excepción: a no puede ser cero. No es una ecuación cuadrática.");
        }
    	
    	//Calculamos el discriminante
    	 double discriminante = this.calcularDiscriminante();

    	 //Validación 2: El discriminante debe ser >= 0 para no producir raíces complejas.
         if (discriminante < 0) {
             throw new Exception("Excepción: No existen raíces reales (discriminante negativo).");
         }

         double raiz1 = (-this.b + Math.sqrt(discriminante)) / (2 * this.a);
         double raiz2 = (-this.b - Math.sqrt(discriminante)) / (2 * this.a);
         ArrayList<Double> raices = new ArrayList<Double>();

         raices.add(raiz1);

         if (discriminante > 0) { //Aquí manejamos el caso en el que el discriminante es cero. Solo hay una raíz.
             raices.add(raiz2);
         }

         return raices;
    }	
}
