/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *La clase CuentaBancaria representa una cuenta bancaria básica con funciones de depósito y retiro.
 * También maneja excepciones de saldo insuficiente.
 * @author lilian
 */
public class CuentaBancaria {
     private double saldo; 
      /**
     * Constructor por defecto que inicializa el saldo en cero.
     */
    
    public CuentaBancaria(){
        saldo=0;
    }
     /**
     * Realiza un depósito en la cuenta.
     * 
     * @param monto El monto a depositar.
     */
    
    public void depositar(double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }
    /**
     * Realiza un retiro de la cuenta, lanzando una excepción en caso de saldo insuficiente.
     * 
     * @param monto El monto a retirar.
     * @throws SaldoInsuficienteException Se lanza si el saldo es insuficiente para realizar el retiro.
     */
    
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando " + monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }
    
     /**
     * Obtiene el saldo actual.
     *
     * @throws UnsupportedOperationException Si la operación no está soportada.
     * Este método lanza una excepción indicando que la operación no está implementada.
     * Este método es generado automáticamente y debe ser implementado según las necesidades.
     */

    void getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
