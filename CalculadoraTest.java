/** 
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Algoritmos y estructuras de datos
 * Nombre del programa: Calculadora.java
    @version: 
        - Creacion: 19/02/2022
        - Ultima modificacion: 19/02/2022
    implementacion de pruebas JUnit para la calse PosfixCalc.java
*/

/**
 * @author melissaperez_
 *
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class CalculadoraTests {

    PosfixCalc calculator;
    @Test
    public void evaluateTest(){
        calc = new PosfixCalc();
        assertEquals(15, calc.Evaluate("1 2 + 4 * 3 +"));
        assertEquals(30, calc.Evaluate("6 2 3 + *"));
    }
    
}
