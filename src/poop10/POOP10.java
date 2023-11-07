/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Lilian
 */
public class POOP10 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        try {
        // Crear un arreglo de mensajes
        String mensajes[] = {"Primero","Segundo","Tercero"}; 
        // Iterar sobre el arreglo
        for (int i = 0; i<=3; i++) {
            // Imprimir mensajes
                System.out.println(mensajes[i]);
        }
        
        } catch(ArrayIndexOutOfBoundsException e){
        // Capturar y manejar la excepción si se sale del rango del arreglo
        
            System.out.println(e.getMessage());
            System.out.println("Error:  apuntador fuera del rango del arreglo.");
            
        }
          // Mensaje después del bloque try-catch
        System.out.println("Hola Mundo 2");
        
        try {
        double x; 
        x= 0/0; //f indica numero flotante 
        System.out.println(x); 
        
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());//regresa ela tributo, mesaje tipo cadena
            System.out.println("Error: división entre cero. ");
        }
        
        try {
        double x; 
        x= 0/0; //f indica numero flotante 
        System.out.println(x); 
        
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//regresa ela tributo, mesaje tipo cadena
            System.out.println("Error: división entre cero. ");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Error: división entre cero. ");
        } catch (Exception e){
        System.out.println(e.getMessage());
        } 
        
        try {
        double x; 
        x= 0/0; //f indica numero flotante 
        System.out.println(x); 
        
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());//regresa ela tributo, mesaje tipo cadena
            e.printStackTrace();
        }
        System.out.println("Hola Mundo 3");
        
        try {
        double division = division(4f,6.0); 
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        
   }
    /**
     * Realiza una operación de división. En este caso, lanza una excepción
     * de UnsupportedOperationException para indicar que la operación no es soportada.
     * 
     * @param f El primer número flotante.
     * @param d El segundo número double.
     * @return El resultado de la división.
     * @throws UnsupportedOperationException Siempre se lanza esta excepción indicando que la operación no es soportada.
     */

    private static double division(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operación no soportada. "); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}