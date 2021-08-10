/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comidas;

/**
 *
 * @author luiss
 */
public class Comida {
    protected String nombre;
    protected int aumentoEnergia;
    protected int satisfaccion;
    protected int aumentoBaño;
    protected int tiempoEspera;

    public String getNombre() {
        return nombre;
    }

    public int getAumentoEnergia() {
        return aumentoEnergia;
    }

    public int getSatisfaccion() {
        return satisfaccion;
    }

    public int getAumentoBaño() {
        return aumentoBaño;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }


    public Comida(String nombre, int aumentoEnergia, int satisfaccion, int aumentoBaño, int tiempoEspera) {
        this.nombre = nombre;
        this.aumentoEnergia = aumentoEnergia;
        this.satisfaccion = satisfaccion;
        this.aumentoBaño = aumentoBaño;
        this.tiempoEspera = tiempoEspera;
    }
    
    
    
    
    
}
