/** 
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Algoritmos y estructuras de datos
 * Nombre del programa: Calculadora.java
    @version: 
        - Creacion: 17/02/2022
        - Ultima modificacion: 00/02/2022
    Clase que implementa la calculadora
*/

/**
 * @author melissaperez_
 *
*/

import java.util.Vector;

public class Stack<T> implements IStack<T> {
    private Vector<T> vector;

    public Stack(){
        vector = new Vector<T>();
    }

    @Override
    public void push(T value) {
        vector.add(value);
    }

    @Override
    public T pull() {
        if(!isEmpty()){ // IF THERE'S SOMETHING IN THE STACK
            T temp = vector.lastElement();
            vector.remove(vector.size() - 1);
            return temp;    
        }else{
            return null;
        }
    }

    @Override
    public T peek() {
        return vector.lastElement();
    }

    @Override
    public int count() {
        return vector.size();
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
}
