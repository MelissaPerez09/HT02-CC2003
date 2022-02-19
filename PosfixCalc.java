/** 
 * VERSION FINAL
 * Nombre: Emily ELvia Melissa Perez Alarcon
 * Carnet: 21385
 * Curso: Algoritmos y estructuras de datos
 * Nombre del programa: Calculadora.java
    @version: 
        - Creacion: 17/02/2022
        - Ultima modificacion: 19/02/2022
    Clase que implementa las operaciones postfix
*/

/**
 * @author melissaperez_
 *
*/

public class PosfixCalc implements IPosfixCalc{

    private String[] Ldato;
    private int resultado;
    private Stack<String> stack = new Stack<String>();
    private int n1;
    private int n2;

    public PosfixCalc(){
        resultado = 0;
    }
    
    /**
     * @param expresion
     * @return int 
     * metodo para evaluar cada expresion posfix
     */
    @Override
    public int Evaluate(String expresion){
        System.out.println("Expresion: " + expresion);
        Ldato = expresion.split(" ");

        for (int i = 0; i < Ldato.length; i++){

            //identifica que es un digito
            if (Ldato[i].matches("\\d")){ 
                stack.push(Ldato[i]);
            }

            //identifica el operador
            else if (Ldato[i].matches(".*[*+/-].*")) 
            {
                if (stack.count() >= 2){
                    n2 = Integer.parseInt(stack.pull());
                    n1 = Integer.parseInt(stack.pull());

                    //realiza la multiplicacion
                    if (Ldato[i].equals("*")){ 
                        resultado = n1 * n2;
                        stack.push(String.valueOf(resultado));
                    }

                    //realiza la suma
                    if (Ldato[i].equals("+")){ 
                        resultado = n1 + n2;
                        stack.push(String.valueOf(resultado));
                    }

                    //realiza la resta
                    if (Ldato[i].equals("-")){ 
                        resultado = n1 - n2;
                        stack.push(String.valueOf(resultado));
                    }

                    //realiza la division
                    if (Ldato[i].equals("/")){ 

                        //evalua si no es una division entre cero
                        if (n2 == 0){
                            System.out.println("(!) Es una division entre 0");
                            return 9999;
                        }

                        //realiza la division
                        else{
                            resultado = n1 / n2;
                            stack.push(String.valueOf(resultado));
                        }
                    }
                }
                //verifica si tiene suficientes operandos
                else{
                    System.out.println("(!) No hay suficientes operandos");
                    for (int j = 0; j < stack.count(); j++){
                        stack.pull();
                    }
                    return 9999;
                }
            }
            //revisa los operadores
            else{ 
                System.out.println("(!) Se tiene un operador invalido");
                return 9999;
            }
        }
        if (stack.count() == 1){
            resultado = Integer.parseInt(stack.pull());
            return resultado;
        }
        //revisa la cantidad de operadores
        else{
            System.out.println("(!) No hay suficientes operadores");
            return 9999;
        }  
    }
}
