
package Comida;


public class Alimento {
    public String nombre;
    public int cantEnergia;
    public int satisfaccion;
    public int restauracion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantEnergia(int cantEnergia) {
        this.cantEnergia = cantEnergia;
    }

    public void setSatisfaccion(int satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    public void setRestauracion(int restauracion) {
        this.restauracion = restauracion;
    }
    
    
    
    public Alimento(String nombre, int cantEnergia, int satisfaccion, int restauracion) {
        this.nombre = nombre;
        this.cantEnergia = cantEnergia;
        this.satisfaccion = satisfaccion;
        this.restauracion = restauracion;
    }
    
}
