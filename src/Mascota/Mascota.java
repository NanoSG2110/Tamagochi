package Mascota;

public class Mascota {
    protected String nombre;
    protected boolean estado;
    protected boolean enfermedad;
    protected int felicidad;
    protected int edad;
    protected int necesidadesF;
    protected int satisfaccion;
    protected int energia;

    public Mascota(String nombre) { // valores iniciales
        this.nombre = nombre;
        this.felicidad = 20;
        this.necesidadesF = 0;
        this.satisfaccion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    public int getAburrimiento() {
        return felicidad;
    }

    public void setAburrimiento(int felicidad) {
        this.felicidad += felicidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad += edad;
    }

    public int getNecesidadesF() {
        return necesidadesF;
    }

    public void setNecesidadesF(int necesidadesF) {
        this.necesidadesF += necesidadesF;
    }

    public int getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(int satisfaccion) {
        this.satisfaccion += satisfaccion;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia += energia;
    }
    
    private String getEtapa() {
        if (this.edad <= 0) {
            return "huevo";
        }
        if (this.edad <= 10) {
            return "bebe";
        }
        if (this.edad <= 25) {
            return "joven";
        }
        if (this.edad <= 50) {
            return "adulto";
        }
        return "GOD";
    }

    /*public String getEstado() {
        if (!this.estaViva()) {
            return "D E A D";
        }
        return "Nombre:" + this.nombre + "\nPeso:" + this.peso + "\nEtapa:" + this.getEtapa() + "\nEdad:" + this.getEdad() + "\nAburrimiento:" + this.aburrimiento
                + "\nnecesidad de cagar: " + this.necesidadesF + "\nNiveles de hambre:" + this.satisfaccion;
    }*/

}
