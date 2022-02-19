/** 
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Algoritmos y estructuras de datos
 * Nombre del programa: Calculadora.java
    @version: 
        - Creacion: 17/02/2022
        - Ultima modificacion: 18/02/2022
    Clase que implementa las operaciones postfix
*/

/**
 * @author melissaperez_
 *
*/

import java.util.Arrays;

public class Calculadora implements IPosfixCalc{
  private static String[] operadores = {"+", "-", "*", "/"};
  private static String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public int operar(String expresion){
        Stack<Integer> stack = new Stack<Integer>();
        try{
            int numero1, numero2;
            String[] valores = expresion.split(" ");
            for (int i=0; i<valores.length; i++){
                if(Arrays.asList(numeros).contains(valores[i])){
                    stack.push(Integer.parseInt(valores[i]));
                }
                else if (Arrays.asList(operadores).contains(valores[i])){
                    switch(valores[i]){
                        case "+":
                            numero2 = stack.pull();
                            numero1 = stack.pull();
                            stack.push(numero1 + numero2);
                        break;

                        case "-":
                            numero2 = stack.pull();
                            numero1 = stack.pull();
                            stack.push(numero1 - numero2);
                        break;

                        case "*":
                            numero2 = stack.pull();
                            numero1 = stack.pull();
                            stack.push(numero1 * numero2);
                        break;

                        case "/":
                            numero2 = stack.pull();
                            numero1 = stack.pull();
                            stack.push(numero1 / numero2);
                        break;

                        default:
                            System.out.println("(!) Ha ocurrido un error.");
                        break;
                    }
                }
                else{
                    throw new NumberFormatException();
                }
            }
            if(stack.count()==1){
                return stack.pull();
            }
            else{
                throw new Exception();
            }
        }
        catch(ArithmeticException a){
            System.out.println("(!) Es una division entre 0");
        }
        catch(NumberFormatException a){
            System.out.println("(!) Se tiene un operador invalido");
        }
        catch(NullPointerException a){
            System.out.println("(!) No se tienen suficientes operadores");
        }
        catch(Exception a){
            System.out.println("(!) No hay suficientes operadores");
        }
        return 0;
    }
}
