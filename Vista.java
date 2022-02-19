/** 
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Programacion orientada a objetos
 * Nombre del programa: Vista.java
    @version: 
        - Creacion: 17/02/2022
        - Ultima modificacion: 18/02/2022
    Clase sistema para inputs y outputs
*/

/**
 * @author melissaperez_
 *
*/

import java.util.Scanner;

public class Vista{
  /**
     * imprime en pantalla el texto ingresado
     * @param text
     */
  public void mensaje(String text){
      System.out.println(text);
  }
  
  /**
   * imprime mensaje de bienvenida
   */
  public void bienvenida(){
      mensaje("Bienvenido a la calculadora POSTFIX");
  }

  /**
   * imprime mensaje de error
   */
  public void error(){
      mensaje("(!)Ha ocurrido un error. Intente de nuevo");
  }

  /**
   * imprime la expresion ingresada y el resultado final
   * @param expresion
   * @param resultado
   */
  public void mostrarResultado(String expresion, int resultado){
      mensaje("La expresion evaluada fue: " + expresion);
      mensaje("El resultado es: " + resultado);
  }

    /**
   * imprime mensaje de bienvenida
   */
  public void despedida(){
    mensaje("Gracias por usar la calculadora POSTFIX :)");
  }
}
