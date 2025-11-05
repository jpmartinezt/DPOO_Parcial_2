package logica.tests;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.*;

public class ClasePruebaTest {
	private ClasePrueba prueba1;
	
	@BeforeEach
    void setUp( ) throws Exception
    {		
		prueba1 = new ClasePrueba();
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }
    
    @Test
    void testGetPrueba( )
    {
    	assertEquals(prueba1.getPrueba(), 0);
    }

}
