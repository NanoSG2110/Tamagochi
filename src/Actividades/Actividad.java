
package Actividades;


public class Actividad {
    public String nombre;
    public int actFisica;
    public int felicidad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setActFisica(int actFisica) {
        this.actFisica = actFisica;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public Actividad(String nombre, int actFisica, int felicidad) {
        this.nombre = nombre;
        this.actFisica = actFisica;
        this.felicidad = felicidad;
    }
    
    
    
}
