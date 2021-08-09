/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascota;

public class Mascota {
    private String nombre;
    private int peso;
    private float conocimiento;
    private int cantidadEstudios;
    private int cantidadAcciones;
    
    public Mascota(String nombre) {
        this.nombre = nombre;
        this.peso = 500;
        this.conocimiento = 0;
        this.cantidadEstudios = 0;
        this.cantidadAcciones = 0;
    }
    
    public String alimentar(int tipo){
        if(tipo==1) peso +=30;
        if(tipo==2) peso +=50;
        if(tipo==3) peso +=100;
        
        this.cantidadEstudios = 0;
        this.cantidadAcciones++;
        return "^_^ Ñam Ñam Ñam";
    }
    
    public String ejercitar(int tipo){
        if(tipo==1) peso -=30;
        if(tipo==2) peso -=50;
        if(tipo==3) peso -=100;
        this.cantidadAcciones++;
        return "U_U uffff";
    }
    
    public String estudiar(){
        if(tieneHambre()){
            return "Tengo hambre";
        }
        this.conocimiento+=0.5;
        this.cantidadEstudios++;
        this.cantidadAcciones++;
        return "*_*";
    }
    
    public boolean estaViva(){
        if (this.peso>1000) return false;
        if (this.peso<200) return false;
        if (this.getEdad()== 2) return false;
        return true;
    }
    
    private int getEdad(){
        int edad = this.cantidadAcciones/6;
        return edad;
    }
    
    private boolean tieneHambre(){
        if(this.cantidadEstudios>=3)return true;
        return false;
    }
    
    private String getProfesion(){
        if (this.conocimiento<1) return "Vago";
        if (this.conocimiento<3) return "Basico";
        if (this.conocimiento<5) return "Medio";
        if (this.conocimiento<7) return "Universitario";
        if (this.conocimiento<9) return "Profesor";
        if (this.conocimiento<11) return "Cientifico Loco";
        return "GOD";
    }
  
    
    public String getEstado(){
        if(!this.estaViva()){
            return "D E A D";
        }
        return "Nombre:"+this.nombre+"\nPeso:"+this.peso+"\nConocimiento:"+
                this.conocimiento+"\nProfesion:"+this.getProfesion()+"\nEdad:"+this.getEdad();
    }
    
}
