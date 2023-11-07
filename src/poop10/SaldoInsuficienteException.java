/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Esta clase representa una excepción personalizada para manejar situaciones en las que se detecta un saldo insuficiente.
 * Extiende la clase Exception, lo que la hace una excepción verificada.
 * La excepción puede ser lanzada cuando se realiza una operación y el saldo no es suficiente.
 * 
 * @author Lilian
 */
public class SaldoInsuficienteException extends Exception {
    String message; 
     /**
     * Constructor predeterminado de la excepción SaldoInsuficienteException.
     * Crea una instancia de la excepción sin un mensaje específico.
     */
    
    public SaldoInsuficienteException(){
         // No se realiza ninguna acción adicional en este constructor.
    
    }
    /**
     * Constructor que permite proporcionar un mensaje específico al crear una instancia de la excepción.
     * 
     * @param message El mensaje que describe la razón de la excepción (en este caso, se ignora y se establece un mensaje predeterminado).
     */
    
    public SaldoInsuficienteException(String message){
         // Llama al constructor de la clase base (Exception) con un mensaje predeterminado.
        super("Saldo insuficiente");
    }   
}

