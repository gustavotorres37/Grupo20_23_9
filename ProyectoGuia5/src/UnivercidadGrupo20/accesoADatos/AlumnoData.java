/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnivercidadGrupo20.accesoADatos;

import UnivercidadGrupo20.entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AlumnoData {
    
//    private Connection con = null;
    Connection con = Conexion.getConexion();
    
    public AlumnoData() {

//        con = Conexion.getConnection();

    }

    public void guardarALumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado) VALUES (?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt("idAlumno"));

                JOptionPane.showMessageDialog(null, "Alumno añadido con exito");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos" + ex.getMessage());
        }

    }

    public Alumno buscarAlumno(int id) {

        Alumno alumno = null;
        String sql = "SELECT dni,apellido,nombre,fechaNacimiento FROM alumno WHERE =? AND estado =1 ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos"+ex.getMessage());

        }
        return alumno;
    }   
    public Alumno buscarAlumnoPorDni(int dni) {

        Alumno alumno = null;
        String sql = "SELECT dni,apellido,nombre,fechaNacimiento FROM alumno WHERE  dni=? AND estado =1 ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);

            } else {

                JOptionPane.showMessageDialog(null, "El alumno no existe");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos"+ex.getMessage());
        }

        return alumno;
    }
    

    public List<Alumno> listaAlumnos() {
        List<Alumno> alumno = new ArrayList<>();

        try {
            String sql = "SELECT * FROM alumno WHERE estado=1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Alumno alu = new Alumno();

                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setActivo(rs.getBoolean("estado"));

                alumno.add(alu);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos"+ex.getMessage());
        }
        return alumno;
    }
    public void modificarAlumnos(Alumno alumno) {

        String sql = "UPDATE alumno  SET dni= ?, apellido=?,nombre=?; fechaNacimiento=?  WHERE idAlumno = ?";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            // Hay que setear los parametros dinamicos.

            ps.setLong(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "MOdificado exitosamente !!");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe ");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos"+ex.getMessage());

        }

    }
     public void eliminarAlumno(int id) {

        try {
            String sql = "UPDATE alumno SET estado=0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el alumno ");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos"+ex.getMessage());
        }

    }
}
