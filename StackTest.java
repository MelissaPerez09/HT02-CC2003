/** 
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Algoritmos y estructuras de datos
 * Nombre del programa: Calculadora.java
    @version: 
        - Creacion: 19/02/2022
        - Ultima modificacion: 19/02/2022
    implementacion de pruebas JUnit para la clase Stack.java
*/

/**
 * @author melissaperez_
 *
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class StackTest{

    @Test
    public void pushTest(){
        Stack<String> stack = new Stack<String>();
        stack.push("value1");
        stack.push("value2");
        stack.push("value3");
        assertEquals("value3", stack.peek());
    }

    @Test
    public void pullTest(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        assertEquals(0, stack.pull()); 
    }

    @Test
    public void countTest(){
        Stack<Double> stack = new Stack<Double>();
        assertEquals(0, stack.count());
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);
        assertEquals(5, stack.count());
        stack.pull(); //quitar uno
        assertEquals(4, stack.count());
    }

    @Test
    public void isEmptyTest(){
        Stack<String> stack = new Stack<String>();
        assertEquals(true, stack.isEmpty());
        stack.push("value");
        assertEquals(false, stack.isEmpty());
    }
}