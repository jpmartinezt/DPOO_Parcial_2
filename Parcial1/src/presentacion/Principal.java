package presentacion;

import logica.*;

public class Principal {

    // Constructor con el caso
    public Principal() {
        try {
        	ClasePrueba prueba1 = new ClasePrueba();
            System.out.println(prueba1.getPrueba());
            System.out.println("correcto");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //main ()
    public static void main(String[] args) {
        new Principal();
    }
}
