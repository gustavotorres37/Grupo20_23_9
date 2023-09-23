
package UnivercidadGrupo20.entidades;

import java.time.LocalDate;


public class Alumno {
    
    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean activo;

    
    //constructor
    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
        this.dni=dni;
        
    }
 // cosntructor 
    
    public Alumno (int dni, String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
        this.dni=dni;
        
    }
  // constructor vacio 
    
    public Alumno() {
    }

    public Alumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

  
    
    
    
    
    
    
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Alumnos{ idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", activo=" + activo + '}';
    }
    
}
