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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulador{
    private Vista vis;
    private Stack<String> linesStack;
    private Posfix calc;

    /**
     * constructor del simulador
     */
    public Simulador(){
        vis = new Vista();
        linesStack = new Stack<String>();
        calc = new Posfix();
    }
    /**
     * para ejecutar
     */
    public void ejecutar(){
        vis.bienvenida();
        if(leerArchivo()){ 
            while(!linesStack.isEmpty()){ 
                String temp = linesStack.pull();
                vis.mostrarResultado(temp, calc.operar(temp));
            }
        }
    }

    
    /**
     * comienza a leer el archivo
     * @return false
     */
    private boolean leerArchivo(){
        try{
            File archivo = new File("datos.txt");
            Scanner fileReader = new Scanner(archivo);
            while(fileReader.hasNextLine()){
                linesStack.push(fileReader.nextLine());
            }
            fileReader.close();
            return true;
        }catch(FileNotFoundException e){
            vis.error();
            return false;
        }
    }
}

