package cs;

import javax.swing.JOptionPane;


public class CS {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conectar();
        
        Alumno al1=new Alumno();
        Alumno al2=new Alumno("22041356","Eduardo","TICS", 77.7);
        al1.setControl("22041321");
        al1.setNombre("Kalo");
        al1.setCarrera("Informatica");
        al1.setPromedio(88.8);
        
        System.out.println("Datos de al1: "+al1);
        System.out.println("Carrera de al1: "+al1.getCarrera());
        System.out.println("Datos al2: "+al2);
        System.out.println("Control de al2: "+al2.getControl());
        String nuco = JOptionPane.showInputDialog("Ingresa numero de control del alumno: ");
        String name = JOptionPane.showInputDialog("Ingresa nombre del alumno: ");
        String carre = JOptionPane.showInputDialog("Ingresa carrera asignada: ");
        double ave = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el promedio: "));
        
        Alumno al3=new Alumno(nuco, name,carre,ave);
        System.out.println(al3);
        
    }
    
}
