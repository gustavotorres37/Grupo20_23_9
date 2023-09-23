package UnivercidadGrupo20.accesoADatos;

import UnivercidadGrupo20.entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InscripcionData {

    Connection con = Conexion.getConexion();  // metodo que conoce la URL,nombre BD , usuario y contraseña. 
    
    // Constructor
    public InscripcionData() {
    }
     // Lista de metodos !!
    public void guardarInscripcion(Inscripcion inscripcion) {

        String sql = "INSERT INTO inscripcion (idAlumno ,IdMateria , nota  )VALUES( ?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // necsitamos obtener la clave de inscripcion cuando la agregamos.
            // Seteo los parametros dinamicos a preparestatement.
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());// voy a setear al entero que corresponde al primer parametros , objetos inscrioco trae un atributo de tipo alumno .Me trae el elumono y de es ealumno me tra el id
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();
            // obtner lista de clave de las inccripciones que agregue , en este caso es una.
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                inscripcion.setIdIncripcion(rs.getInt(1));  // el IDINSCRPCION se encuentra en el ResultSET.
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro al conectarse a la tabla Inscricion  ");
        }

    }

    public void actualizarNota(double nota , int idAlumno, int idMateria) {
         
          String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria=?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            // seteo los parametros dinamicos.
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            // El metodo esxecutepdate()  me devuelve un numero entero. Si se ejecuto con exito me devuelte la cantidad de filas afectadas , en este caso un 1.
            int filas = ps.executeUpdate();

            if (filas ==1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la inscripcion ");
                ps.close();

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos  ");
        }

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion  WHERE idAlumno =? AND idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, " Se pudo elinimar la inscripcion");

            }
          ps.close();
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }

    }

}
