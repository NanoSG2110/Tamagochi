package Mascota;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            opcion=opcionesInicio();
            if (opcion==1){
                System.out.println("Nombre mascota");
                String nombre = sc.next();
                Mascota mascota = new Mascota(nombre);
                do{
                    opcion=opcionesMascota();
                    
                    if(opcion==1){
                        System.out.println("Info");
                        System.out.println(mascota.getEstado());
                    }
                    if(opcion==2){
                        int alimento = opcionesAlimento();
                        System.out.println("Alimentando...");
                        //System.out.println(mascota.alimentar(alimento));
                    }
                    if(opcion==3){
                        int ejercicio = opcionesEjercicio();
                        System.out.println("Ejercitando...");
                        //System.out.println(Actividades.Jugar.
                    }
                }while(opcion!=0 && opcion!=9 && mascota.estaViva());
                System.out.println(mascota.getEstado());
            }
        }while(opcion!=0);
    }
    
    public static int opcionesInicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su opcion");
        System.out.println("1.Crear nueva mascota");
        System.out.println("0.Salir");
        return sc.nextInt();
    }
    
    public static int opcionesMascota(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su opcion");
        System.out.println("1.Estado");
        System.out.println("2.Alimentar");
        System.out.println("3.Ejercitar");
        System.out.println("4.Estudiar");
        System.out.println("9.Reset");
        System.out.println("0.Salir");
        return sc.nextInt();
    }
    
    public static int opcionesAlimento(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("Ingrese su alimento");
            System.out.println("1.Pan");
            System.out.println("2.Fideos");
            System.out.println("3.MC");
            op = sc.nextInt();
        }while(op<1 || op>3);
        
        return op;
    }
    
    public static int opcionesEjercicio(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("Ingrese su ejercicio");
            System.out.println("1.Caminar");
            System.out.println("2.Trotar");
            System.out.println("3.Correr");
            op = sc.nextInt();
        }while(op<1 || op>3);
        
        return op;
    }
    
}
