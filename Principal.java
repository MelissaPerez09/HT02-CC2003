/** 
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Algoritmos y estructuras de datos
 * Nombre del programa: Calculadora.java
    @version: 
        - Creacion: 17/02/2022
        - Ultima modificacion: 18/02/2022
    Clase que implementa la calculadora
*/

/**
 * @author melissaperez_
 *
*/

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal{

    private static ArrayList<String> leerArchivo(){
        Vista vis = new Vista();
        try{
            File datos = new File("datos.txt");
            ArrayList<String> archivoDatos = new ArrayList<String>();
            Scanner entrada = new Scanner(datos);
            while(reader.hasNextLine()){
                archivoDatos.add(reader.nextLine());
            }
            reader.close();
            return archivoDatos;
        }
        catch(FileNotFoundException a){
            vis.error();
            return null;
        }
    }

    public static void main(String[] args){
        Vista vis = new Vista();
        Calculadora calc = new Calculadora();
        vis.bienvenida();
        for(int i=0; i < leerArchivo().size(); i++){
            int resultado = calc.operar(leerArchivo().get(i));
            if(resultado != 000){
                vis.mostrarResultado();
            }
            vis.despedida();
        }
    }
}
