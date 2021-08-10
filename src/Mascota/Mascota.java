package Mascota;

public class Mascota {
    protected String nombre;
    protected boolean estado;
    protected boolean enfermedad;
    protected int peso;
    protected int aburrimiento;
    protected int edadT;
    protected int necesidadesF;
    protected int satisfaccion;
    protected int energia;

    public Mascota(String nombre) { // valores iniciales
        this.nombre = nombre;
        this.peso = 20;
        this.aburrimiento = 20;
        this.necesidadesF = 0;
        this.satisfaccion = 0;
    }

    public boolean estaViva() {
        if (this.peso > 100) {
            return false;
        }
        if (this.peso < 0) {
            return false;
        }
        if (this.getEdad() == 100) {
            return false;
        }
        return true;
    }

    private int getEdad() {
        int edad = this.edadT;
        return edad;
    }
    
    
    

    private String getEtapa() {
        if (this.edadT <= 0) {
            return "huevo";
        }
        if (this.edadT <= 10) {
            return "bebe";
        }
        if (this.edadT <= 25) {
            return "joven";
        }
        if (this.edadT <= 50) {
            return "adulto";
        }
        return "GOD";
    }

    public String getEstado() {
        if (!this.estaViva()) {
            return "D E A D";
        }
        return "Nombre:" + this.nombre + "\nPeso:" + this.peso + "\nEtapa:" + this.getEtapa() + "\nEdad:" + this.getEdad() + "\nAburrimiento:" + this.aburrimiento
                + "\nnecesidad de cagar: " + this.necesidadesF + "\nNiveles de hambre:" + this.satisfaccion;
    }

}
