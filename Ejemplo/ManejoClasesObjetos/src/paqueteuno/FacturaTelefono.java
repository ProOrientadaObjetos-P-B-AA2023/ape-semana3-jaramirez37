/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class FacturaTelefono {
    private String numeroTelefono;
    private double minutosMes;
    private double valorMinuto;
    private double valorFactura;
    
    public void establecerNumeroTelefono(String c){
        this.numeroTelefono = c;
    }
    
    public void establecerMinutosMes(double c){
        this.minutosMes = c;
    }
    
    public void establecerValorMinuto(double c){
        this.valorMinuto = c;
    }
    
    // public void establecerValorFactura(){
    public void calcularValorFactura(){
        this.valorFactura = this.minutosMes * this.valorMinuto;
    }
    
    public String obtenerNumeroTelefono(){
        return this.numeroTelefono;
    }
    
    public double obtenerMinutosMes(){
        return this.minutosMes;
    }
    
    public double obtenerValorMinuto(){
        return this.valorMinuto;
    }
    
    public double obtenerValorFactura(){
        return this.valorFactura;
    }
    
    
    
}
