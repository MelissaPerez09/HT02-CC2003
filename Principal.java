/** 
 * VERSION FINAL
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Algoritmos y estructuras de datos
 * Nombre del programa: Calculadora.java
    @version: 
        - Creacion: 17/02/2022
        - Ultima modificacion: 19/02/2022
    Clase que implementa la calculadora y lee el archivo a operar
*/

/**
 * @author melissaperez_
 *
*/

import java.io.File;  
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.util.ArrayList;

public class Principal{

    /**
     * metodo para leer el archivo
     * @return null
     */
    private static ArrayList<String> leerArchivo(){
        //comienza a leer el archivo
        try {
            File datos = new File("datos.txt");
            ArrayList<String> archivo = new ArrayList<String>();
            Scanner reader = new Scanner(datos); 
            while (reader.hasNextLine()){
                archivo.add(reader.nextLine());
            }
            reader.close();
            return archivo;
        } 
        //manejo de errores para leer el archivo
        catch (FileNotFoundException e) {
            System.out.println("(!) Ha ocurrido un error al leer el archivo.");
            return null;
        }
    }
    
    /** 
     * ejecuta el programa
     * @param args
     */
    public static void main(String[] args) {
        PosfixCalc calc = new PosfixCalc();
        System.out.println("\n\nBienvenido a su calculadora POSFIX\n");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < leerArchivo().size(); i++){
            int resultado = calc.Evaluate(leerArchivo().get(i));
            if (resultado != 9999){ //validar que no haya errores
                System.out.println("Resultado: " + resultado);
            }
            System.out.println("----------------------------------------------\n");
        }  
        System.out.println("\nGracias por usar la calculadora :)\n");      
    }
}
