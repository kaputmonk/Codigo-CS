
package cs;


public class Alumno {
    //
    private String control;
    private String nombre;
    private String carrera;
    private double promedio;
    
    //metodos set

    public void setControl(String control) {
        this.control = control;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //metodos get

    public String getControl() {
        return control;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }
    
    //constructor por omision
    public Alumno(){
        
    }
    
    //contructor override
    public Alumno(String control, String nombre, String carrera, double promedio) {
        this.control = control;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno: " + "control= " + control + ", nombre= " + nombre + ", carrera= " + carrera + ", promedio= " + promedio;
    }
    
}
