/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * 
 * Este programa simula las operaciones de un cajero automático utilizando la clase CuentaBancaria.
 *
 */
package poop10;

/**
 * La clase Cajero contiene el método main que realiza operaciones en una cuenta bancaria.
 *
 * @author lilian
 */
public class Cajero {
    public static void main(String[] args){
          // Crear una instancia de la clase CuentaBancaria
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        try {
            // Realizar depósito inicial de $2000
            cuentaBancaria.depositar(2000);
            // Realizar retiro de $1000
            cuentaBancaria.retirar(1000);
            // Obtener saldo actual
            cuentaBancaria.getSaldo();
            // Realizar segundo retiro de $1000
            cuentaBancaria.retirar(1000);
            // Obtener saldo actual
            cuentaBancaria.getSaldo();
             // Realizar tercer retiro de $1000
            cuentaBancaria.retirar(1000);
            // Obtener saldo actual
            cuentaBancaria.getSaldo();
            // Realizar depósito de $2000
            cuentaBancaria.depositar(2000);
            // Intentar realizar un retiro de $100, puede lanzar una SaldoInsuficienteException
            cuentaBancaria.retirar(100);
        } catch (SaldoInsuficienteException e){
            // Manejar la excepción de saldo insuficiente
            e.printStackTrace();
            System.out.println(e.getMessage());
        }   
    }  
}


